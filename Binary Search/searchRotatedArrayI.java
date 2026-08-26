import java.util.Scanner;
// Search in Rotated Sorted Array which have "Unique ELements".
public class searchRotatedArrayI {
    static int search(int nums[], int target){

        int low = 0, high = nums.length - 1, mid;

        while (low<=high) {
            mid = (low + high)/2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) { // left is sorted
                if(nums[low] <= target && nums[mid] >=target){
                    high =  mid - 1;
                } else{
                    low = mid + 1;
                }
            } else { // right is sorted
                if(nums[mid] <= target && nums[high] >= target){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } 
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element : ");
        int target = sc.nextInt();
        
        int[] nums = {7,8,9,1,2,3,4,5,6};

        int result = search(nums, target);

        System.out.println("Index : " + result);

        sc.close();
    }
}
