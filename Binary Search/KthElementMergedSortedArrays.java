import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KthElementMergedSortedArrays {
    public static int kthElement(ArrayList<Integer> nums1, ArrayList<Integer> nums2, int n1, int n2, int k) {
        // Write your coder here
        if(n1 > n2) return kthElement(nums2,nums1,n2,n1,k);

        int low = Math.max(k-n2, 0), high = Math.min(k , n1);
        int left = k;
        while(low<=high){
            int mid1 = (low + high) /2;
            int mid2 = left - mid1;

            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;

            if(mid1 < n1) r1 = nums1.get(mid1);
            if(mid2 < n2) r2 = nums2.get(mid2);

            if(mid1 - 1 >= 0) l1 = nums1.get(mid1 - 1);
            if(mid2 - 1 >= 0) l2 = nums2.get(mid2 - 1); 

            if(l1 <= r2 && l2 <=r1){
                return Math.max(l1,l2);
            } else if(l1 > r2){
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(
        Arrays.asList(1, 2, 3, 4, 9, 10)
        );

        ArrayList<Integer> nums2 = new ArrayList<>(
            Arrays.asList(2, 3, 7, 12, 18)
        );

        int n1 = nums1.size();
        int n2 = nums2.size();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        System.out.println("K-th element: " +
            kthElement(nums1, nums2, n1, n2, k));

        sc.close();
    }
}
