package Recursion;

import java.util.Scanner;

// Print Linearly from N to 1 using Back Tracking


public class backtrackingPrintLinearlyReverse {
    static void printing(int cnt,int n){
        if (cnt>n) {
            return;
        }
        printing(cnt+1, n);
        System.out.print(cnt+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        printing(1, n);
    }
}
