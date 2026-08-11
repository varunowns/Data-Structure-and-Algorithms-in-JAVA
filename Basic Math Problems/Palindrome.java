import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int orgNUm = num;
        int lastDigit;
        int revNum = 0;

        while(num>0){
            lastDigit = num % 10;
            revNum = (revNum*10) + lastDigit;
            num = num/10;
        }
        if(revNum == orgNUm){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        sc.close();
    }
}
