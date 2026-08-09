import java.util.*;

public class Pattern7 {
    static void print7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.print("Enter no. of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print7(n);
        sc.close();
    }
}