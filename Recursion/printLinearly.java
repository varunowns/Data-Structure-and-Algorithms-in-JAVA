package Recursion;

import java.util.Scanner;

// Print Linearly from 1 to N

public class printLinearly {
    static void printLinear(int cnt,int n){
        if (cnt > n) {
            return;
        }
        System.out.print(cnt+" ");
        printLinear(cnt+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();
        int cnt = 1;

        printLinear(cnt, n);
        sc.close();
    }
}
