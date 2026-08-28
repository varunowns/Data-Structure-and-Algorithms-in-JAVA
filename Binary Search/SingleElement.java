import java.util.Scanner;

public class SingleElement {
    static int find(int nums[]){

        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }
        int low = 1, high = nums.length - 2, mid;

        while (low<=high) {
            mid = (low + high)/2;

            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]){
                return nums[mid];
           }
           /*Condition of left half*/
            if ((mid %2 == 1 && nums[mid - 1] == nums[mid]) || (mid %2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1; // ELiminate left half
           } else {
                high = mid - 1;
           }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {1,1,2,2,3,3,4,5,5,6,6};

        System.out.println("Single ELement : " + find(nums));

        sc.close();
    }
}
