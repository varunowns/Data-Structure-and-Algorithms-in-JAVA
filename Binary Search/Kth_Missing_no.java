public class Kth_Missing_no {
    static int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1, mid, missingCtr = 0;
        while(low<=high){
            mid = (low + high)/2;
            missingCtr =arr[mid] - (mid + 1);
            if(missingCtr < k){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;    
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int k = 5;
        System.out.println("Missing Value at " + k + " position : " + findKthPositive(arr, k));
    }
}
