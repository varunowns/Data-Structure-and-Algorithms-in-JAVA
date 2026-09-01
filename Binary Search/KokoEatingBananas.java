public class KokoEatingBananas {
    static long totalHours(int piles[], long hourly){
        long totalHrs = 0;

        for(int i = 0; i<piles.length; i++){
            totalHrs+= (long) Math.ceil((double) piles[i]/hourly);
        }
        return totalHrs;
    }
    static int minEatingSpeed(int piles[], int h){
        int ans = Integer.MAX_VALUE, low = 1, high = piles[0], mid;

        for (int i : piles) {
            high = Math.max(i, high);
        }
        while (low<=high) {
            mid = (low + high)/2;

            long totalHrs = totalHours(piles, mid);

            if (totalHrs <= h) {
                high = mid - 1;
                ans = mid;
                
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] piles = {3,6,7,11}; int h = 8;

        System.out.println("Speed is : " + minEatingSpeed(piles, h));
    }
}
