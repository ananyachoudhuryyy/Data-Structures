public class rotate {
    static void reverse(int[] arr,int low,int high){

        while(low < high){

            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

     static void rotateByK(int[] arr,int k){

        int n = arr.length;

        k = k % n;

        // reverse whole array
        reverse(arr,0,n-1);

        // reverse first k elements
        reverse(arr,0,k-1);

        // reverse remaining elements
        reverse(arr,k,n-1);
    }
}
