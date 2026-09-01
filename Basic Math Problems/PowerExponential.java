import java.util.Scanner;

public class PowerExponential {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter non - ngeative integer : ");
        int x = sc.nextInt();

        System.out.print("Enter exponential  : ");
        int n = sc.nextInt();

        System.out.println("Answer is : " + power(x, n));

        sc.close();
    }
}
