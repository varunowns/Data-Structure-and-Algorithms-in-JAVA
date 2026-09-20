class Solution {
    static int search(int nums[], int target){

        int low = 0, high = nums.length - 1, mid, result = nums.length;

        while (low<=high) {
            mid = (low+high)/2;
            
            if (nums[mid] >= target) {
                high = mid - 1;
                result = mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }
        }
        return result;
    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int cnt_max = 0;
        int index = 0;
        int cnt_ones;
        for(int i = 0; i < mat.length; i++){
            Arrays.sort(mat[i]);
            cnt_ones = mat[i].length - search(mat[i], 1);

            if(cnt_ones > cnt_max){
                cnt_max = cnt_ones;
                index = i;
            }
        }
        int arr[] = {index,cnt_max};
        return arr;
    }
}