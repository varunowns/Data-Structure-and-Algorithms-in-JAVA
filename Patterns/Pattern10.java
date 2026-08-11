import java.util.*;

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class Pattern10 {

    static void print10(int n) {

        for(int i = 1; i <= (2*n)-1; i++) {

            if(i <= n) {

                for(int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

            } else {

                for(int j = 1; j <= (2*n)-i; j++) {
                    System.out.print("*");
                }

            }

            System.out.println();
        }
    }

    public static void main(String args[]) {

        System.out.print("Enter no. of rows : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print10(n);

        sc.close();
    }
}