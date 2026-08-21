import java.util.Scanner;

public class Prob_704 {
    static int search(int nums[], int target){

        int low = 0, high = nums.length-1, mid;

        while (low<=high) {
            mid = (low+high)/2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (target > nums[mid]) {
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {3,4,6,7,9,12,16,17}; 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        int result = search(nums, target);
        System.out.println("Index: " + result);

        sc.close();
    }
}
