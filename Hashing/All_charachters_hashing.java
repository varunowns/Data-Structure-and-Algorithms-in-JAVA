
package Hashing;

import java.util.Scanner;

public class All_charachters_hashing {

    static int[] hashing(String s) {
        int hashTable[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            hashTable[s.charAt(i)] += 1;
        }

        return hashTable;
    }

    public static void main(String[] args) {
        String s = "AbCdAb12@#cF!";
        int hashTable[] = hashing(s);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Which character do you want to search and count (0 to exit): ");

            char ch = sc.next().charAt(0);

            if (ch == '0') {
                break;
            }

            if (ch >= 256) {
                System.out.println("Character not supported.");
                continue;
            }

            System.out.println("Total times " + ch + " appeared in string: " + hashTable[ch]);
        }

        sc.close();
    }
}
