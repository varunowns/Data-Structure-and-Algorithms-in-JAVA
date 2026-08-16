package Recursion;

import java.util.Scanner;

// Sum of N numbers ! 

public class sumOfNnumbers {

    // Parameterised Way!

    static void sum1(int n, int sum){
        if (n<1) {
            System.out.println("Sum (Parameterized) : "+ sum);
            return;
        }
        sum1(n-1, sum+n);
    }

    // Functional

    static int sum2(int n){
        if (n==0) {
            return 0;
        }
        return n + sum2(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N : ");
        int n = sc.nextInt();
        sum1(n, 0);
        System.out.println("Sum (functional): " + sum2(n));
        sc.close();
    }
}
