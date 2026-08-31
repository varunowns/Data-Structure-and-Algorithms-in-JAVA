import java.util.Scanner;

public class sqrtx {
    static int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } 
            else if (square > x) {
                high = mid - 1;
            } 
            else {
                ans = mid;
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int x = sc.nextInt();

        System.out.println("Square root of " + x + " : " + mySqrt(x));

        sc.close();
    }
}
