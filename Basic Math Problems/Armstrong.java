import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int orgNum = num;
        double newNum = 0;
        int lastDigit;
        while (num > 0) {
            lastDigit = num % 10;
            newNum = newNum + (Math.pow(lastDigit, 3));
            num/=10;
        }

        if (orgNum == newNum) {
            System.out.println(orgNum+" is an Armstrong number.");
        } else{
            System.out.println(orgNum+" is not an Armstrong number.");
        }
        sc.close();
    }
}