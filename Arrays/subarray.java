public class subarray {

    // print all subarrays

    static void printSubarray(int[] arr){
        int n = arr.length;
System.out.println("All subarrays:\n");
        for(int start=0;start<n;start++){
            for(int end=start;end<n;end++){
                for(int i=start;i<=end;i++){
                 System.out.println(arr[i]+" ");
                }
                System.out.println();
        }
        }
    }

    static void sumOfSubarray(int[] arr){
        int n= arr.length;

        for(int start=0;start<n;start++){
            int sum=0;
            for(int end=start; end<n;end++){
                sum+=arr[end];
                System.out.println(sum+" ");
            }
        }
    }


    public static void main(String[] args) {
        int[] arr1={3,6,1,2};

        printSubarray(arr1);
        System.out.println("\n");
        sumOfSubarray(arr1);
    }
}
