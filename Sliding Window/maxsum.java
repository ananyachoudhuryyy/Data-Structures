public class maxsum {
    // Input  : arr[] = [100, 200, 300, 400],  k = 2
    // Output : 700
    // Explanation: We 
    // get maximum sum by adding subarray [300,400] of size 2
    static int maxSubarraySum(int arr[], int n, int k){

        // k must be greater
        // than n
        if (n < k)
            return -1;
 
        // Compute sum of first window of size k
        int res = 0;
        for (int i = 0; i < k; i++)
            res += arr[i];
 
        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int curr_sum = res;
        for (int i = k; i < n; i++) {
            curr_sum += arr[i] - arr[i - k];
            res = Math.max(res, curr_sum);
        }
 
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        int n = arr.length;
        System.out.println(maxSubarraySum(arr, n, k  ));
    }
}
