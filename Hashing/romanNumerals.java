package Hashing;

// Given a string s representing a Roman numeral, find it's corresponding integer value.
// Roman numerals are formed using the following symbols: 
// I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, and M = 1000.


public class romanNumerals {
     static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
     static int romanToInteger(String s) {
        int res = 0; 

        for (int i = 0; i < s.length(); i++) {
            
            //get value of current symbol
            int s1 = value(s.charAt(i));

            // compare with the next symbol if it exists
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));

                // If current value is greater or equal, 
                // add it to result
                if (s1 >= s2) {
                    res += s1;
                }
                else {
                    // else, add the difference and skip 
                    // next symbol
                    res += (s2 - s1);
                    i++;
                }
            }
              else {
                res += s1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "IX";
        System.out.println(romanToInteger(s));
    }
}
