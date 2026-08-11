import java.util.*
;
public class GCD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf=1;
        for(int i = 1; i<=Math.min(num1, num2); i++){
            if(num1%i==0 && num2%i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF of "+ num1 + " and " + num2 + " is : " + hcf);
        sc.close();
    }    
}
