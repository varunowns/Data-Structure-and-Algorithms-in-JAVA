import java.util.*;


public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int orgNUm = num;
        int ctr = 0;
        while(num>0){
            int lastDigit = num%10;
            ctr++;
            num = num/10;
        }
        System.out.println("Number of digits in "+orgNUm+" are : "+ctr+".");
        sc.close();
    }
}
