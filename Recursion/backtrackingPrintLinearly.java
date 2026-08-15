package Recursion;

import java.util.Scanner;

public class backtrackingPrintLinearly {
    static void printing(int n){
        if (n<1) {
            return;
        }
        printing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printing(n);
        sc.close();
    }
}
