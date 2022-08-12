package ss3_array.excercise.e6;

import java.util.Scanner;

public class TotalValueCol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter m,n:");
        int m = s.nextInt();
        int n = s.nextInt();
        float[][] arr = new float[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter arr[" + i + "][" + j + "]: ");
                arr[i][j] = s.nextFloat();
            }
        }
        System.out.println("total col number: ");
        int col = s.nextInt();
        float total = 0f;
        for (int i = 0; i < arr[col].length; i++) {
            total += arr[i][col];
        }
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%.1f  ", arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Total = " + total);
    }
}
