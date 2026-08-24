import java.util.Scanner;

public class floor_ceil {
    static int floor(int nums[], int target){
        int low = 0; int high = nums.length -1, mid;
        int result = -1;
        
        while (low<=high) {
            mid = (low+high)/2;

            if (nums[mid] <= target) {
                result = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }

        return result;
    }
    static int ceil(int nums[], int target){
        int low = 0, high = nums.length - 1, mid;
        int result = -1;

        while (low<=high) {
            mid = (low + high)/2;

            if (nums[mid] >= target) {
                high = mid -1;
                result = nums[mid];
            } else{
                low = mid + 1;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter target : ");
        int target = sc.nextInt();

        int nums[] = {1,2,3,3,5,8,8,10,10,11};

        int floorResult = floor(nums, target);
        int ceilResult = ceil(nums, target);

        System.out.println("Floor : " + floorResult);
        System.out.println("Ceil : " + ceilResult);

        sc.close();;
    }
}
