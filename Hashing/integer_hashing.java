package Hashing;

import java.util.Scanner;

class intHashing {

    static int[] hashing(int arr[]) {
        int[] hashTable = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hashTable[arr[i]] += 1;
        }
        return hashTable;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 3};
        int hashTable[] = hashing(arr);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Which number do you want to search and count (-1 to exit): ");
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            if (n < 0 || n >= hashTable.length) {
                System.out.println("Please enter a number between 0 and 12.");
                continue;
            }

            System.out.println("Total times " + n + " appeared in array: " + hashTable[n]);
        }

        sc.close();
    }
}
