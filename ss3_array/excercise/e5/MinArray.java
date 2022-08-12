package ss3_array.excercise.e5;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length array:");
        int length = s.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Array[" + i + "]: ");
            arr[i] = s.nextInt();
        }
//        int[] arr = {8, 27, 5, 6, 7, 8, 3, 10, 23, 22};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-3d", arr[i]);
        }
        System.out.println("\nMin: " + min);
    }
}
