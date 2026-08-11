import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int ctr = 0;
        // System.out.println("All divisors of " + num + " are : ");
        for(int i =1; i<=num; i++){
            if(num % i == 0){
                // System.out.println(i);
                ctr++;
            }
        }
        if (ctr == 2) {
            System.out.println(num + " is Prime number.");
        } else{
            System.out.println(num+" is not Prime number.");
        }

        sc.close();
    }
}
