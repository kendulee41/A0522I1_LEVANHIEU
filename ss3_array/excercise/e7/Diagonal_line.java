package ss3_array.excercise.e7;

import java.util.Scanner;

public class Diagonal_line {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = s.nextInt();
        float[][] arr = new float[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter arr[" + i + "][" + j + "]: ");
                arr[i][j] = s.nextFloat();
            }
        }
        float total = 0f;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][i];
        }
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%.1f  ", arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Total= "+total);
    }
}
