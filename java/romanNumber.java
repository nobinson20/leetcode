import java.util.*;
class Solution {
    public int romanToInt(String s) {
        
        // Variables
        int input, output = 0;
        char prevLetter = 'z';
        
        // Taking input number (roman)
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type roman number");
        
        // Convert string to array
        char [] romanArray = s.toCharArray();
        for (char e : romanArray){
            
            // 1-1 condition M (1000)
            if (e == 'M'){
                output += 1000;
                if (prevLetter == 'C')
                    output -= 200;
                prevLetter = 'M';
            }
            
            // 1-2 condition D (500)
            if (e == 'D'){
                output += 500;
                if (prevLetter == 'C')
                    output -= 200;
                prevLetter = 'D';
            }
            
            // 2-1 condition C (100)
            if (e == 'C'){
                output += 100;
                if (prevLetter == 'X')
                    output -= 20;
                prevLetter = 'C';
            }
            
            // 2-2 condition L (50)
            if (e == 'L'){
                output += 50;
                if (prevLetter == 'X')
                    output -= 20;
                prevLetter = 'L';
            }
            
            // 3-1 condition X (10)
            if (e == 'X'){
                output += 10;
                if (prevLetter == 'I')
                    output -= 2;
                prevLetter = 'X';
            }
            
            // 3-2 condition V (5)
            if (e == 'V'){
                output += 5;
                if (prevLetter == 'I')
                    output -= 2;
                prevLetter = 'V';
            }
            
            // 4th condition I (1)
            if (e == 'I'){
                output += 1;
                prevLetter = 'I';
            }
        }

        return output;
    }
}
