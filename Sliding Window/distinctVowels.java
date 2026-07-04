// Given a string str containing lowercase alphabets, the task is
//  to count the sub-strings that contain all the
//   vowels at-least one time and there are 
//  no consonants (non-vowel characters) present in the sub-strings.

// Examples: 

// Input: str = "aeoibsddaaeiouudb" 
// Output: 4 
// Explanation: The 4 distinct substrings containing all the vowels in order are "aaeiouu", "aeiouu", "aeiou", and "aaeiou".

import java.util.Map;
import java.util.HashMap;

public class distinctVowels {
     public static int countVowelSubstrings(
            String str) {
        Map<Character, Integer> freq = new HashMap<>();
        int n = str.length();
        int ans = 0;

        // Sliding window approach
        for (int i = 0, cnt = 0, j = 0, 
                pref = 0; i < n; i++) {

            char ch = str.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' 
                    || ch == 'o' || ch == 'u') {

                freq.put(ch, freq.getOrDefault(
                    ch, 0) + 1);

                if (freq.get(ch) == 1) {
                    cnt++;
                }

                // Adjust window to avoid duplicates
                while (freq.getOrDefault(
                        str.charAt(j), 0) > 1) {
                    freq.put(str.charAt(j), 
                        freq.get(str.charAt(j)) - 1);
                    pref++;
                    j++;
                }

                // If all vowels are present, update
                // result
                if (cnt == 5) {
                    ans += (1 + pref);
                }
            } else {

                // Reset for non-vowel characters
                cnt = 0;
                pref = 0;
                freq.clear();
                j = i + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "aeoibsddaaeiouudb";

        System.out.println(countVowelSubstrings(
            str));
    }
}