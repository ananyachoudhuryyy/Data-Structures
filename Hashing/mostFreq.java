package Hashing;

// Input : arr[] = [1, 3, 2, 1, 4, 1]
// Output : 1

public class mostFreq {
     static int mostFreqEle(int[] arr) {
        int n = arr.length, maxcount = 0;
        int res = 0;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            
            // If count is greater or if count 
            // is same but value is bigger.
            if (count > maxcount || (count == maxcount && arr[i] > res)) {
                maxcount = count;
                res = arr[i];
            }
        }

        return res;
    }
public static void main(String[] args) {
        int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
        System.out.println(mostFreqEle(arr));
    }
}
