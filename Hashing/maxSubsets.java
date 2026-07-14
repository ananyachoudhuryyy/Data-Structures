package Hashing;

//maximum subsets made with all distinct elements
// Input : arr[] = {1, 2, 3, 3}
// Output : 2
// Explanation : We need to create two subsets {1, 2, 3} and {3} 
// [or {1, 3} and {2, 3}] such that both subsets have distinct elements.

public class maxSubsets {
     static int minSubsets(int[] arr) {
        int n = arr.length, maxCount = 0, res = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) count++;
            }

            if (count > maxCount) {
                maxCount = count;
                res = arr[i];
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {40, 50, 30, 40, 50, 30, 30};
        System.out.println(minSubsets(arr));
    }
}
