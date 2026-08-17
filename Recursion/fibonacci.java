package Recursion;

import java.util.Scanner;

public class fibonacci {
    static int fibonacci_value(int n){
        if (n<=1) {
            return n;
        }
        int last = fibonacci_value(n-1);
        int second_last = fibonacci_value(n-2);

        return last + second_last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a position : ");
        int n = sc.nextInt();

        System.out.println("Value at " + n + " place : " + fibonacci_value(n));

        sc.close();
    }
}
