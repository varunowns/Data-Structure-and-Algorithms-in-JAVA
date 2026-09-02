class Solution {

    static int findMin(int[] bloomDay) {
        int low = bloomDay[0];

        for (int i = 1; i < bloomDay.length; i++) {
            if (bloomDay[i] < low) {
                low = bloomDay[i];
            }
        }

        return low;
    }

    static int findMax(int[] bloomDay) {
        int high = bloomDay[0];

        for (int i = 1; i < bloomDay.length; i++) {
            if (bloomDay[i] > high) {
                high = bloomDay[i];
            }
        }

        return high;
    }

    static boolean possible(int arr[], int day, int m, int k) {
        int ctr = 0, noOfB = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                ctr++;
            } else {
                noOfB += (ctr / k);
                ctr = 0;
            }
        }

        noOfB += (ctr / k);

        return noOfB >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        if (n < (long)m * k) {
            return -1;
        }

        int low = findMin(bloomDay);
        int high = findMax(bloomDay);
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}