package Heaps;

// Input:  arr[] = [90, 15, 10, 7, 12, 2] 
// Output: true

public class checkHeap {
    public static boolean isHeapUtil(int[] arr, int i, int n) {

        // If leaf node
        if (i >= n / 2)
            return true;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (arr[i] < arr[left])
            return false;

        // Check right child only if exists
        if (right < n && arr[i] < arr[right])
            return false;

        // Recurse
        return isHeapUtil(arr, left, n) &&
               (right >= n || isHeapUtil(arr, right, n));
    }

    public static boolean isMaxHeap(int[] arr) {
        return isHeapUtil(arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {90, 15, 10, 7, 12, 2, 7, 3};
        System.out.println(isMaxHeap(arr) ? "true" : "false");
    }

}
