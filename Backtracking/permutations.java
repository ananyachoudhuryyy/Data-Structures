package Backtracking;

// Given a string s. Find all permutations  of a given string.
//  Return the permutations in lexicographically
//   non-decreasing order.

// Examples:

// Input:  s = "ABC"
// Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]

import java.util.ArrayList;
import java.util.Collections;

public class permutations {
    public static void recurPermute(int index, StringBuilder s, ArrayList<String> res) {
        if (index == s.length()) {
            res.add(s.toString());
            return;
        }

        for (int i = index; i < s.length(); i++) {
            char temp = s.charAt(index);
            s.setCharAt(index, s.charAt(i));
            s.setCharAt(i, temp);

            // fix current position and recurse
            recurPermute(index + 1, s, res);

            // backtrack
            temp = s.charAt(index);
            s.setCharAt(index, s.charAt(i));
            s.setCharAt(i, temp);
        }
    }

    public static ArrayList<String> permutation(String s) {
        ArrayList<String> res = new ArrayList<>();

        recurPermute(0, new StringBuilder(s), res);

        // sort lexicographically
        Collections.sort(res);

        return res;
    }

    public static void main(String[] args) {
        String s = "ABCD";

        ArrayList<String> res = permutation(s);

        for (String x : res) System.out.print(x + "\n");
    }
}
