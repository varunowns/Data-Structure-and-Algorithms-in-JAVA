package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

// WAP to print the subsequences whose sum is K

public class sumSubsequences {
    static void sumSubsq(int arr[], int sum, int index, int k, ArrayList<Integer> list){
        if (index==arr.length) {
            if (sum == k) {
                System.out.println(list);   
            }
            return;
        }

        list.add(arr[index]);
        sum += arr[index];

        sumSubsq(arr, sum, index+1, k, list);

        list.remove(Integer.valueOf(arr[index]));
        sum -= arr[index];

        sumSubsq(arr, sum, index+1, k, list);
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

        System.out.print("Enter the sum of elements in Subsequence : ");
        int k = sc.nextInt();

        ArrayList<Integer>list = new ArrayList<>();

        sumSubsq(arr, 0, 0, k, list);
        
        sc.close();
    }
    
}
