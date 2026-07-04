package Backtracking;
// given a binary matrix maze[][] of size n × n 
// containing values 0 and 1, find all possible paths for
//  a rat to travel from the source cell (0, 0) to the
//   destination cell (n - 1, n - 1). The rat can move in four
//    directions: up, down, left, and right.

// 1 represents an open cell through which the rat can move.
// 0 represents a blocked cell that cannot be traversed

import java.util.ArrayList;
import java.util.Collections;

class RatInAMaze {

    // Directions: Down, Left, Right, Up
    static String dir = "DLRU";
    static int[] dr = {1, 0, 0, -1};
    static int[] dc = {0, -1, 1, 0};

    // Check if a cell is valid (inside the maze and open)
    static boolean isValid(int r, int c, int n, int[][] maze) {
        return r >= 0 && c >= 0 && r < n && c < n && maze[r][c] == 1;
    }

    // Function to find all valid paths
    static void findPath(int r, int c, int[][] maze, StringBuilder path,
                                    ArrayList<String> res) {
        int n = maze.length; 

        // If destination is reached, store the path
        if (r == n - 1 && c == n - 1) {
            res.add(path.toString());
            return;
        }
        
        // Mark current cell as visited
        maze[r][c] = 0; 

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i], nc = c + dc[i];
            if (isValid(nr, nc, n, maze)) {
                path.append(dir.charAt(i));
                
                // Move to the next cell recursively
                findPath(nr, nc, maze, path, res); 
                
                // Backtrack
                path.deleteCharAt(path.length() - 1);
            }
        }
        
        // Unmark current cell
        maze[r][c] = 1;  
    }

    // Function to find all paths and return them
    static ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        int n = maze.length;
        StringBuilder path = new StringBuilder();

        if (maze[0][0] == 1 && maze[n - 1][n - 1] == 1) {
            
            // Start from (0,0)
            findPath(0, 0, maze, path, result);  
        }

        // Sort results lexicographically
        Collections.sort(result);
        
        return result;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        ArrayList<String> result = ratInMaze(maze);

        for (String p : result) {
            System.out.print(p + " ");
        }
    }
}
