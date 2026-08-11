import java.util.*;

//     *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****  
//    ***   
//     *    

public class Pattern9 {
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
    static void print9(int n){
        print7(n);
        print8(n);
    }
    
    public static void main(String args[]){
        System.out.print("Enter no. of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print9(n);
        sc.close();
    }
}