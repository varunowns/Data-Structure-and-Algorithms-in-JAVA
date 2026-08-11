import java.util.*;
//Method 2 
// EUCLIDEAN ALGORITHM
public class GCD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while(num1>0 && num2>0){
            if (num1>num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        if (num1 == 0) {
            System.out.println(num2 + " is GCD.");
        } else{
            System.out.println(num1+ " is GCD.");
        }
        sc.close();
    }    
}
