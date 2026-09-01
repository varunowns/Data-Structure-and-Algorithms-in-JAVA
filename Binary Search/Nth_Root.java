import java.util.Scanner;

public class Nth_Root {
    static long power(int x, int n){
        long ans = 1;
        while (n>0) {
            if (n % 2 == 1) {
                ans = ans * x;
                n = n - 1;
            } else {
                n = n/2;
                x = x * x;
            }
        }
        return ans;
    }

    static int nthroot(int x, int n){

        int low = 1, high = x, mid;

        while (low<=high) {
            mid = (low + high)/2;
            
            if (power(mid, n) == x) {
                return mid;
            } else if (power(mid, n) >  x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no : ");
        int x = sc.nextInt();

        System.out.print("Enter 'value of n' root : " );
        int n = sc.nextInt();

        System.out.println("Result : " + nthroot(x, n));

        sc.close();
    }

}
