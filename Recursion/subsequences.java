package Recursion;

import java.util.*;

// to print all the Subsequences of an Array

public class subsequences {
    static void printSubsequences(int arr[], int index, ArrayList<Integer> list){
        if (index >= arr.length) {
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        printSubsequences(arr, index+1, list);  //Case of Picking element

        list.remove(Integer.valueOf(arr[index]));
        printSubsequences(arr, index+1, list);  //Case of NOT Picking element
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of an Array : ");

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer>list = new ArrayList<>();

        printSubsequences(arr, 0, list);
        
        sc.close();
    }
}
