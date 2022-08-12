package ss3_array.excercise.e4;

import java.util.Scanner;

public class Matrix {
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
        float max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%.1f  ", arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Max: " + max);
    }
}
