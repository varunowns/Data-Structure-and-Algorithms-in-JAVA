package Recursion;

import java.util.*;

// Printing names 'n' times using recursion

public class printName {
    
    static void printname(int cnt, int n, String name){
        
        if (cnt > n) {
            return;   
        }
        System.out.println(name);
        // cnt++;
        printname(cnt+1,n, name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt =1;
        System.out.print("Enter a count of names : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        printname(cnt,n, name);

        sc.close();
	}

}
