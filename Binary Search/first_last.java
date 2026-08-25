import java.util.Scanner;

public class first_last {

    static int first(int nums[], int target) {

        int low = 0, high = nums.length - 1, mid;
        int result = -1;

        while (low <= high) {

            mid = (low + high) / 2;

            if (target == nums[mid]) {

                if (mid == 0) {
                    result = mid;
                    break;

                } else if (nums[mid - 1] < nums[mid]) { // Searching left for "First occurrence"
                    result = mid;
                    break;

                } else {
                    high = mid - 1;
                }

            } else if (target > nums[mid]) {
                low = mid + 1; // Search right for target occurrence

            } else {
                high = mid - 1; // Search left for target occurrence
            }
        }

        return result;
    }


    static int last(int nums[], int target) {

        int low = 0, high = nums.length - 1, mid;
        int result = -1;

        while (low <= high) {

            mid = (low + high) / 2;

            if (target == nums[mid]) {

                if (mid == nums.length - 1) {
                    result = mid;
                    break;

                } else if (nums[mid + 1] > nums[mid]) { // Searching right for "Last occurrence"
                    result = mid;
                    break;

                } else {
                    low = mid + 1;
                }

            } else if (target > nums[mid]) {
                low = mid + 1; // Search right for target occurrence

            } else {
                high = mid - 1; // Search left for target occurrence
            }
        }

        return result;
    }


    static int[] firstAndLast(int nums[], int target) {

        int first = first(nums, target);
        int last = last(nums, target);

        return new int[]{first, last};
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums[] = {5, 7, 7, 8, 8, 10};

        System.out.println("Enter your target : ");
        int target = sc.nextInt();

        int[] result = firstAndLast(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
        sc.close();
    }
}