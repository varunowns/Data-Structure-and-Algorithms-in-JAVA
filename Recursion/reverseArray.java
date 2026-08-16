package Recursion;

import java.util.Scanner;

// Reversing an Array  

public class reverseArray {

    // using 2 Pointers (i.e 2 Variables)

    static void reverse1(int arr[], int left, int right){
        if (left>=right) {
            return;
        }
        // Swapping
        int temp =  arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse1(arr, left+1, right-1);
    }

    // using 1 Pointers (i.e 1 Variables)

    static void reverse2(int arr[], int i, int n){
        if (i >= n/2) {
            return;
        }
        //Swapping
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverse2(arr, i+1, n);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        
        int arr1[] = new int[n];

        System.out.println("Enter elements of Array : ");
        
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        int arr2[] = arr1.clone();

        reverse1(arr1, 0, n-1);
        System.out.print("Reversed array : ");

        for(int i = 0; i < n; i++){
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println();

        reverse2(arr2, 0, n);
        System.out.print("Reversed array : ");

        for(int i = 0; i < n; i++){
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}
