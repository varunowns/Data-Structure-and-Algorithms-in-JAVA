import java.util.Arrays;

public class RowWithMaximumOnes {
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

    static int[] rowAndMaximumOnes(int[][] mat) {
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
    public static void main(String[] args) {
        int[][] mat = {
        {0, 1, 1},
        {1, 0, 0},
        {1, 1, 1}
        };

        int[] result = rowAndMaximumOnes(mat);

        System.out.println("Row index: " + result[0]);
        System.out.println("Maximum ones: " + result[1]);

    }
}
