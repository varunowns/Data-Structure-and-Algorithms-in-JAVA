import java.util.*;
//method 2
public class Factors2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("All divisors of " + num + " are : ");
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
            System.out.println(i);

                if (i != num / i) {
                    System.out.println(num / i);
                }
            }
        }

        sc.close();
    }    
}
