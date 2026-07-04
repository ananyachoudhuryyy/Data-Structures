// Given a binary array arr[] and an integer k, find the maximum length
//  of a subarray containing all ones after flipping 
//  at most k zeroes to 1's.

// Examples: 

// Input: arr[] = [1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1], k = 2
// Output: 8
// Explanation: By flipping the zeroes at index 5 and 7, 
// we get the longest subarray from index 3 to 10 containing all 1's.

public class maximumOnes {
    static int maxOnes(int[] arr, int k){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int count=0;

            for(int j=0;j<arr.length;j++){
                if(arr[j]==0) count++;

                if(count <=k){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int k = 2;
        System.out.println(maxOnes(arr,k));
    }
}
