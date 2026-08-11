import java.util.*;

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

public class Pattern5 {
    static void print5(int n){
        for(int i=1; i<=n; i++){
            for(int j=n;j>=i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.print("Enter no. of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print5(n);
        sc.close();
    }
}
