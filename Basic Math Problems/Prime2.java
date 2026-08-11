import java.util.*;

public class Prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        // System.out.println("All divisors of " + num + " are : ");

        int ctr =0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
            // System.out.println(i);
                ctr++;
                if (i != num / i) {
                    // System.out.println(num / i);
                    ctr++;
                }
            }
        }
        if (ctr == 2) {
            System.out.println(num + " is Prime number.");
        } else{
            System.out.println(num+" is not Prime number.");
        }

        sc.close();
    }
}
