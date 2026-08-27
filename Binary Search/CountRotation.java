public class CountRotation {
    static int count(int nums[]){
        int low = 0, high = nums.length - 1, mid;
        int result = Integer.MAX_VALUE;
        int index = -1;

        while (low<=high) {
            mid = (low + high)/2;

            if (nums[low]<=nums[mid]) {
                if (nums[low]<result) {
                    index = low;
                    result = nums[low];
                }
                low = mid + 1;                
            } else {
                if (nums[low]<result) {
                    index = mid;
                    result = nums[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int result = count(nums);

        System.out.println("Total times Array Rotated : " + result);
    }
}
