import java.util.Scanner;

public class upperbound {
    static int search(int nums[], int target){

        int low = 0, high = nums.length - 1, mid, result = nums.length;

        while (low<high) {
            mid = (low+high)/2;
            
            if (nums[mid] > target) {
                high = mid - 1;
                result = mid;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {1,2,3,3,5,8,8,10,10,11};

        System.out.println("Enter your target : ");
        int target = sc.nextInt();

        int result = search(nums, target);

        System.out.println("Upper Bound Index : " + result);

        sc.close();
    }
}
