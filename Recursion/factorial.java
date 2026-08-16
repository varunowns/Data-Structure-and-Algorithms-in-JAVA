package Recursion;

import java.util.Scanner;

public class factorial {
    
    // Functional way
    
    static int fact1(int n){
        if (n==1) {
            return 1;
        }
        return n * fact1(n-1);
    }

    // Parameterized way

    static void fact2(int n, int fact){
        if(n==1){
            System.out.println("Factorial is (Parameterized) : " + fact);
            return;
        }
        fact2(n-1, n*fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Factorial is (Functional) : " + fact1(n));
        fact2(n, 1);

        sc.close();
    }
}
