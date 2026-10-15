package Hashing;

import java.util.Scanner;

public class lowerCase_charachter_hashing {

    static int[] hashing(String s){
        int hashTable[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hashTable[s.charAt(i) - 'a'] += 1;
        }
        return hashTable;
    }
    public static void main(String[] args) {
        String s = "abcdabefc";
        int hashTable[] = hashing(s);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Which character do you want to search and count (0 to exit): ");

            char ch = sc.next().charAt(0);
            if (ch == '0') {
                break;
            }
            System.out.println("Total times " + ch + " appeared in string: " + hashTable[ch - 'a']);
        }

        sc.close();
        
    }
}
