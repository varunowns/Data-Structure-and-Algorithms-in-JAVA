class Solution {
    static long divisor(int nums[], int mid){
        long ctr=0, div;
        for (int i : nums) {
            div = Math.ceilDiv(i, mid);
            ctr+=div;
        }
        return ctr;
    }
    static int maxHigh(int nums[]){
        int high = nums[0];
        for (int i : nums) {
            high = Math.max(high, i);
        }
        return high;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = maxHigh(nums), mid;
        
        while (low<=high) {
            mid = (low + high)/2;
            if(divisor(nums, mid) <= threshold){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}