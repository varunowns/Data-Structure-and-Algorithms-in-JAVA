public class SmallestDivisorThreshold {
    static int divisor(int nums[], int mid){
        int ctr=0, div;
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
    static int minimumDivisor(int nums[], int threshold){
        int low = 1, high = maxHigh(nums), mid;
        
        while (low<=high) {
            mid = (low + high)/2;
            if(divisor(nums, mid) <= threshold){
                return mid;
            } else if (divisor(nums, mid) > threshold) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,5,9};
        int threshold = 6;
        System.out.println("Smallest divisor is : " + minimumDivisor(nums, threshold));
    }
}
