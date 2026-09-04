public class MinCapacityOfShip {
    static int maxNums(int nums[]){
        int low = nums[0];
        for (int i : nums) {
            low = Math.max(i, low);
        }
        return low;
    }
    static int sumNums(int nums[]){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return sum;
    }
    static int daysRequired(int nums[], int mid){
        int days = 1, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= mid) {
                sum+=nums[i];
            } else {
                days = days + 1;
                sum = nums[i];
            }
        }
        return days;
    }
    static int mincapacity(int nums[], int days){
        int low = maxNums(nums), high = sumNums(nums), mid;
        int ans = low;
        while (low<=high) {
            mid = (low + high)/2;
            if (daysRequired(nums, mid) > days) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println("Minimum Capacity : " + mincapacity(nums, days));
    }
}
