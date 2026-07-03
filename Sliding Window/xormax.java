import java.util.*;

public class xormax {
 static void findMaxXor(int ind, int curXOR, 
        int curSize, int k, int n, int[] arr, int[] maxXOR) {
    
        // If the current subset is of size k
        if (curSize == k) {
            maxXOR[0] = Math.max(maxXOR[0], curXOR);
            return;
        }
    
        // If all elements are processed
        if (ind == n) {
            return;
        }
    
        // Include the current element
        findMaxXor(ind + 1, curXOR ^ arr[ind], 
                curSize + 1, k, n, arr, maxXOR);
    
        // Exclude the current element
        findMaxXor(ind + 1, curXOR, 
                curSize, k, n, arr, maxXOR);
    }
    
    // Function to return the maximum xor for a
    // subset of size k from the given array
    static int maxKSubset(int[] arr, int k) {
        int n = arr.length;
        
        // to store the maximum xor
        int[] maxXOR = new int[1];
        maxXOR[0] = Integer.MIN_VALUE;
        
        // Traverse all subsets of the array
        findMaxXor(0, 0, 0, k, n, arr, maxXOR);
        
        return maxXOR[0];
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 1, 3, 7, 6, 8};
        int k = 3;
        System.out.println(maxKSubset(arr, k));
    }
}
