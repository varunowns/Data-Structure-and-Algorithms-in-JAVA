import java.util.Scanner;


public class Count_Occurrence {
    static int lowerBound(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    static int upperBound(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    static public int[] searchRange(int[] nums, int target) {

        int first = lowerBound(nums, target);
        int last = upperBound(nums, target) - 1;

        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{first, last};
    }

    static int count(int nums[], int target){
         
        int[] range = searchRange(nums, target);

        if (range[0] == -1) {
            return 0;
        }
        return range[1] - range[0] + 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target : ");
        int target = sc.nextInt();

        int nums[] = {1,2,3,3,5,8,8,8,11};

        int result = count(nums, target);

        System.out.println("Total no of Occurrences : " + result);

        sc.close();
    }
}
