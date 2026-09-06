class Solution {
    static int MaxNums(int nums[]){
        int low = nums[0];
        for (int i : nums) {
            low = Math.max(i, low);
        }
        return low;
    }

    static int sumNums(int nums[]){
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    static int pages(int nums[], int mid){
        int stdCtr = 1, pagesStudent = 0;
        for (int i : nums) {
            if (pagesStudent + i <= mid) {
                pagesStudent += i;
            } else {
                stdCtr++;
                pagesStudent = i;
            }
        }
        return stdCtr;
    }

    public int splitArray(int[] nums, int k) {
        int low = MaxNums(nums);
        int high = sumNums(nums);
        int mid, ans = high;
        int n = nums.length;

        if (n < k) {
            return -1;
        }

        while (low <= high) {
            mid = (low + high) / 2;

            if (pages(nums, mid) <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}