class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high= nums.length - 1, mid, result = nums.length;

        while(low<=high){
            mid = (low + high)/2;

            if(nums[mid] >= target){
                high = mid - 1 ;
                result = mid;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}