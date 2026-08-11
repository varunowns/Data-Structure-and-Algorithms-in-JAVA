import java.util.*;
//method 1
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("All divisors of " + num + " are : ");
        for(int i =1; i<=num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }    
}
