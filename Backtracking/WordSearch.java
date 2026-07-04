package Backtracking;
// Given a 2D array mat[][] of characters and a string word, 
// check whether the word exists in the array or not. 
// The word can be matched in four possible directions: 
// horizontally left or right, and vertically up or down
// . Each cell can be used only once in forming the word.

// Examples: 

// Input: mat[][] = [['T', 'E', 'E'], ['S', 'G', 'K'], ['T', 'E', 'L']],
//  word = "GEEK"
// Output: true
// Explanation: Word "GEEK" can be found in the given grid as follows
public class WordSearch {
     // Recursive Function to check if the word exists in the matrix or not
    static boolean findMatch(char[][] mat, String word, int x, int y, 
                             							  int wIdx) {
        int wLen = word.length();
        int n = mat.length;
        int m = mat[0].length;
        if (wIdx == wLen)
            return true;

        // Out of Boundary
        if (x < 0 || y < 0 || x >= n || y >= m)
            return false;

        // If grid matches with a letter while recursion
        if (mat[x][y] == word.charAt(wIdx)) {
            
            // Marking this cell as visited
            char temp = mat[x][y];
            mat[x][y] = '#';

            // finding subpattern in 4 directions
            boolean res = findMatch(mat, word, x - 1, y, wIdx + 1) ||
                          findMatch(mat, word, x + 1, y, wIdx + 1) ||
                          findMatch(mat, word, x, y - 1, wIdx + 1) ||
                          findMatch(mat, word, x, y + 1, wIdx + 1);
            mat[x][y] = temp;
            return res;
        }
        return false;
    }

    // Function to check if the word exists in the matrix or not
    static boolean isWordExist(char[][] mat, String word) {
        int wLen = word.length();
        int n = mat.length;
        int m = mat[0].length;

        // if total characters in matrix is less than word length
        if (wLen > n * m)
            return false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                // If first letter matches, then recur and check
                if (mat[i][j] == word.charAt(0)) {
                    if (findMatch(mat, word, i, j, 0))
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] mat = {{'T', 'E', 'E'}, {'S', 'G', 'K'}, {'T', 'E', 'L'}};
        String word = "GEEK";
        System.out.println(isWordExist(mat, word));
    }
}
