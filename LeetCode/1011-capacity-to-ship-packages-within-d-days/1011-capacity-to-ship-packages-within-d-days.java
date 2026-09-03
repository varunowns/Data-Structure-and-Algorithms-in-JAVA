class Solution {
    static int maxWeights(int weights[]){
        int low = weights[0];
        for (int i : weights) {
            low = Math.max(i, low);
        }
        return low;
    }
    static int sumWeights(int weights[]){
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum+=weights[i];
        }
        return sum;
    }
    static int daysRequired(int weights[], int mid){
        int days = 1, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] <= mid) {
                sum+=weights[i];
            } else {
                days = days + 1;
                sum = weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = maxWeights(weights), high = sumWeights(weights), mid;
        int ans = low;
        while (low<=high) {
            mid = (low + high)/2;
            if (daysRequired(weights, mid) > days) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
}