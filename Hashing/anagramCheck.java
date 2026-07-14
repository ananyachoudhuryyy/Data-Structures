package Hashing;

import java.util.Arrays;

// Input: s1 = “geeks”  s2 = “kseeg”
// Output: true
// Explanation: Both the string have same characters with same frequency. 
// So, they are anagrams.

// Input: s1 = "allergy", s2 = "allergyy"
// Output: false
// Explanation: Although the characters are mostly the same, s2 contains an extra
//  'y' character.
//  Since the frequency of characters differs, the strings are not anagrams.

public class anagramCheck {
    static boolean areAnagrams(String s1, String s2) {
        
        if (s1.length() != s2.length()) return false;
        
        // Sort both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        
        String s1 = "geeks";
        String s2 = "kseeg";
        
        if(areAnagrams(s1, s2) == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}
