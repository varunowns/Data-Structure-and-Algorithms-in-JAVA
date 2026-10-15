package Hashing;

import java.util.Scanner;

public class upperCase_charachter_hashing {

    static int[] hashing(String s){
        int hashTable[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hashTable[s.charAt(i) - 'A'] += 1;
        }
        return hashTable;
    }
    public static void main(String[] args) {
        String s = "ABCDABEFC";
        int hashTable[] = hashing(s);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Which character do you want to search and count (0 to exit): ");

            char ch = sc.next().charAt(0);
            if (ch == '0') {
                break;
            }
            if (ch < 'A' || ch > 'Z') {
                System.out.println("Please enter an uppercase letter (A-Z).");
                continue;
            }
            System.out.println("Total times " + ch + " appeared in string: " + hashTable[ch - 'A']);
        }

        sc.close();
        
    }
}
