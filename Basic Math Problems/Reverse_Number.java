import java.util.*;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int orgNUm = num;
        int lastDigit;
        int revNum = 0;

        while(num>0){
            lastDigit = num % 10;
            revNum = (revNum*10) + lastDigit;
            num = num/10;
        }
        System.out.println("Reverse of "+orgNUm+ " is : "+revNum);
        sc.close();
    }
}
