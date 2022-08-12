package ss3_array.excercise.e3;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[6];
        int[] arr2 = new int[5];
        System.out.println("Enter array 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Array_1[" + (i + 1) + "]:");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter array 2:");
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Array_2[" + (j + 1) + "]:");
            arr2[j] = sc.nextInt();
        }
        int[] arr = new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr[i] = arr1[i];
        }
        int k=0;
        for (int j=arr1.length;j<arr.length;j++){
            arr[j] = arr2[k];
            k++;
        }
        System.out.print("Merged array:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
