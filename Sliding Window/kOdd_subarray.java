
// Given an integer array arr[] of size n, and a target integer k.
//  Determine the number of contiguous subarrays
//   (i.e., continuous segments of the array) 
// that contain exactly k odd numbers.

// nput : arr = [2, 5, 6, 9],  k = 2 
// Output: 2

public class kOdd_subarray {
    static int countSubarrays(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        // traverse for all possible subarrays
        for (int i = 0; i < n; i++)  {

            int odd = 0;
            for (int j = i; j < n; j++) {

                // if current element is odd
                if (arr[j] % 2 != 0)
                    odd++;

                // if count of odd numbers in
                // subarray is k
                if (odd == k)
                    count++;
            }
        }
        return count;    
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 6, 9, 2, 11};
        int k = 2;
        System.out.println(countSubarrays(arr, k));
    }
    
}
