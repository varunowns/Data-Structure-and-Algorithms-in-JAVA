import java.util.Scanner;

public class Pattern11 {
    static void printPascal(int n) {
        for (int i = 0; i < n; i++) {
            int num = 1;

            // Spaces
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        printPascal(n);

        sc.close();
    }
}
