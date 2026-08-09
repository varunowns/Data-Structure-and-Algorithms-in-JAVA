import java.util.*;

// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5

public class Pattern4 {
    static void print4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.print("Enter no. of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print4(n);
        sc.close();
    }    
}
