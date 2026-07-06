 import java.util.Arrays;
 public class smallestsubarray {
   

    // Function to find the length of the smallest subarray with sum greater than x
public static int smallestSubWithSum(int x, int[] arr)
    {
        int n = arr.length;

        int res = Integer.MAX_VALUE;
        int[] preSum = new int[n + 1];

        // Compute the prefix sums
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + arr[i - 1];
        }

        // Iterate through each starting index
        for (int i = 1; i <= n; i++) {
            int toFind = x + preSum[i - 1] + 1;
            int bound = Arrays.binarySearch(preSum, toFind);
            if (bound < 0) {
                bound = -(bound + 1);
            }

            if (bound <= n) {
                int len = bound - (i - 1);
                res = Math.min(res, len);
            }
        }

        // If subarray does not exists
        if (res == Integer.MAX_VALUE)
            return 0;
        return res;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 4, 45, 6, 10, 19 };
        int x = 51;

        System.out.println(smallestSubWithSum(x, arr));
    }
} 
    

