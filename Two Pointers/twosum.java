 import java.util.ArrayList;



// Given a 1-based indexed integer array arr[] that is sorted in non-decreasing 
// order,along with an integer target. find two elements in the 
//  array such that their sum is equal to target. 
//  If such a pair exists, return the indices of the two 
//  elements in increasing order. If no such pair exists, return [-1, -1].

// Examples:

// Input: arr[] = [2, 7, 11, 15], target = 9
// Output: 1 2
// Explanation: Since the array is 1-indexed, arr[1] + arr[2] = 2 + 7 =  9
public class twosum {
    public static ArrayList<Integer> twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int current_sum = arr[left] + arr[right];
            // If current sum = target, return left and right
            if (current_sum == target) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(left + 1); // 1-based indexing
                result.add(right + 1);
                return result;
            }
            // If current sum < target, then increase the
            // current sum by moving the left pointer by 1
            else if (current_sum < target) {
                left++;
            }
            else {
                // If current sum > target, then decrease the
                // current sum by moving the right pointer by 1
                right--;
            }
        }

        // no pair sum with given target
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        ArrayList<Integer> result = twoSum(arr, target);
        for (int num : result) {
            System.out.print(num + " ");
        }
}
}
