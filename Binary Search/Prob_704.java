import java.util.Scanner;


public class Prob_704 {
    static int search1(int nums[], int target){   //Brute Force Appproach

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

    static int search2(int nums[], int low, int high, int target){  //Recursive Approach
        if (low>high) {
            return -1;
        }
        int mid = (low+high)/2;

        if (nums[mid] == target) {
            return mid;
        } else if (target > nums[mid]) {
            return search2(nums, mid+1, high, target);
        } else{
            return search2(nums, low, mid-1, target);

        }
    }

    public static void main(String[] args) {
        int nums[] = {3,4,6,7,9,12,16,17}; 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        int result = search1(nums, target);
        System.out.println("Index (result1): " + result);

        int result2 = search2(nums, 0, nums.length, target);
        System.out.println("Index (result2): " + result2);


        sc.close();
    }
}
