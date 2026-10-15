package Hashing;

import java.util.Scanner;

class intHashing {

    static int[] hashing(int arr[]){
        int[] hashTable = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hashTable[arr[i]] += 1;
        }
        return hashTable;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,3};
        int hashTable[] = hashing(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Which no you want to search and count : ");
        int n = sc.nextInt();

        System.out.println("Total times " + n + " appeared in array : " + hashTable[n]);

        sc.close();
    }
}