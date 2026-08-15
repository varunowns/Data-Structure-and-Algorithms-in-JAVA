package Recursion;

import java.util.Scanner;

// Print Linearly from N to 1

public class printLinearlyreverse {
    static void printLinear(int n){
        if (n<1) {
            return;
        }
        System.out.print(n+" ");
        printLinear(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        printLinear(n);
        sc.close();
    }
}
