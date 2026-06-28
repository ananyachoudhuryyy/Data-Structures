public class kadanes {

    static int maximumSubarraySum(int[] arr){  //brute force approach
        int n=arr.length;
        int maxSum= Integer.MIN_VALUE;

        for(int start=0;start<n;start++){
            int sum=0;
            for(int end=start;end<n;end++){
                sum+=arr[end];

                if(sum> maxSum){
                    maxSum=sum;
                }
            }


        }
        return maxSum;

    }

    static int KadanesAlgo(int[] arr){
        int n=arr.length;
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            currsum+=arr[i];
            maxSum=Math.max(maxSum, currsum);

            if(currsum <0)
                currsum=0; // if current sum is negative, reset. 
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int sum= maximumSubarraySum(arr);

        System.out.println(sum);
        int[] arr2= {-1, 2, 3, -4};
        int sum2=maximumSubarraySum(arr2);
        System.out.println("Sum 2: "+sum2);
        
    }
}
