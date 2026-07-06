public class closestPair {
    static int[] findClosestPair(int[] a, int[] b, int x) {
        int l = 0, r = b.length - 1;
        int diff = Integer.MAX_VALUE;
        int[] result = new int[2];

        // Two pointer traversal
        while (l < a.length && r >= 0) {
            int sum = a[l] + b[r];
            int currDiff = Math.abs(sum - x);

            // Update result if better pair found
            if (currDiff < diff) {
                diff = currDiff;
                result[0] = a[l];
                result[1] = b[r];
            }

            // Move pointers
            if (sum > x)
                r--;
            else
                l++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7};
        int[] b = {10, 20, 30, 40};
        int x = 38;

        int[] ans = findClosestPair(a, b, x);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}

