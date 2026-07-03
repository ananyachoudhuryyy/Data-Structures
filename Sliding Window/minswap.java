// Input: arr[] = [1, 0, 1, 0, 1]
// Output: 1
// Explanation: Only 1 swap is required to group all 1's together. 
// Swapping index 1 with 4 will give arr[] = [1, 1, 1, 0, 0]

public class minswap {
    static int minSwaps(int[] arr)
    {
        // Count the number of 1s in the array 
        int countOne = 0;
        int n = arr.length;
        for (int num : arr) {
            if (num == 1)
                countOne++;
        }
        if (countOne == 0)
            return -1;

        // Iterate over possible windows of size
        // equals to countones
        int minSwap = Integer.MAX_VALUE;
        for (int i = 0; i <= n - countOne; i++) {
            int oneCount = 0;
            for (int j = i; j < i + countOne; j++) {
                if (arr[j] == 1)
                    oneCount++;
            }
            minSwap
                = Math.min(minSwap, countOne - oneCount);
        }

        return minSwap;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 0, 1, 0, 1};
        System.out.println(minSwaps(arr));
    }
}
