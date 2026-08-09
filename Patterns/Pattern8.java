import java.util.*;

public class Pattern8 {
    static void print8(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*n)-(2*i)+1; j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.print("Enter no. of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print8(n);
        sc.close();
    }
}