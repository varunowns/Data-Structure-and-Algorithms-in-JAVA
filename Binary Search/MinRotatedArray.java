public class MinRotatedArray {
    static int minimum(int nums[]){
        int low = 0, high = nums.length - 1, mid;
        int result = Integer.MAX_VALUE;

        while (low<=high) {
            mid = (low + high)/2;

            if (nums[low]<=nums[mid]) {
                result = Math.min(result, nums[low]);
                low = mid + 1;                
            } else {
                result = Math.min(result, nums[mid]);
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int result = minimum(nums);

        System.out.println("Minimum Element : " + result);
    }
}
