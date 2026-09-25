public class Median_in_a_Row_Wise_Sorted_Matrix {
    
    static int upperbound(int arr[], int target){
        int low = 0, high = arr.length - 1, mid;
        int result = arr.length;

        while(low<=high){
            mid = (low + high)/2;
            if(arr[mid] > target){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    static int blackBox(int matrix[][], int n, int mid){
        int cnt = 0;
        for(int i=0; i<n; i++){
            cnt+= upperbound(matrix[i], mid);
        }
        return cnt;
    }
    public static int findMedian(int matrix[][], int n, int m) {

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m-1]);
        }

        int req = (n*m)/2;

        while(low<=high){
            int mid = (low + high)/2;

            int smallerEquals = blackBox(matrix, n, mid);

            if(smallerEquals <= req) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
    public static void main(String[] args) {

    int matrix[][] = {
        {1, 3, 5},
        {2, 6, 9},
        {3, 6, 9}
    };

    int n = matrix.length;
    int m = matrix[0].length;

    int ans = findMedian(matrix, n, m);

    System.out.println("Median = " + ans);
}
}
