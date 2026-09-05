import java.util.Arrays;

public class Aggressive_Cows {
    static boolean possible(int position[], int dist, int m){
        int ctr = 1; int last = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= dist) {
                ctr++;
                last = position[i]; 
            }
            if (ctr == m) {
                return true;
            }
        }
        return  false;
    }
    
    static int maxDistance(int position[], int m){
        Arrays.sort(position);
        int n = position.length;
        int low = 1, high = position[n - 1] - position[0];
        int mid;
        while (low<=high) {
            mid = (low + high)/2;

            if (possible(position, mid, m) == true) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int position[] = {1,2,3,4,7};
        int m = 3;
        System.out.println("Max position is : " + maxDistance(position, m));
    }
}
