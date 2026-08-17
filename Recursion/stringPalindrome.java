package Recursion;

import java.util.Scanner;

public class stringPalindrome {
    static boolean isPalindrome(String str, int i, int n){
        if (i>=n/2) {
            return true;
        }
        if (str.charAt(i)!=str.charAt(n-i-1)) {
            return false;   
        }
        return isPalindrome(str, i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        int n = str.length();
        if (isPalindrome(str, 0, n) == true) {
            System.out.println("Strign is Palindrome.");
        } else{
            System.out.println("String is not Palindrome.");
        }


        sc.close();
    }   
}

    
