import java.util.*;

// Search in Rotated Sorted Array with "DUPLICATE" elements
public class searchRotatedArrayII{
    static boolean search(int nums[], int target){
        int low = 0, high = nums.length - 1, mid;
        while(low<=high){
            mid = (low + high)/2;
            if(nums[mid] == target) return true;

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++; high--;
            } else{
                if(nums[high]>=nums[mid]){
                    if(nums[mid]<=target && nums[high]>=target){
                        low = mid + 1;
                    } else{
                        high = mid - 1;
                    }
                } else {
                    if(nums[low]<=target && nums[mid]>=target){
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element : ");
        int target = sc.nextInt();
        
        int[] nums = {7,8,9,1,2,3,3,3,4,5,6};

        // int result = search(nums, target);

        System.out.println("Found : " + search(nums, target));

        sc.close();
    }
}