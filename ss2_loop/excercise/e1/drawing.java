package _2_loop.excercise.e1;

import java.util.Scanner;

public class drawing {
    public static void main(String[] args) {
        int choice = -1;
        Scanner s = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Draw the  rectangle");
            System.out.println("2. Print the square triangle" +
                    " (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Chieu dai:");
                    int cd = s.nextInt();
                    System.out.println("Chieu rong:");
                    int cr = s.nextInt();
                    for (int i = 0; i < cr; i++) {
                        for (int j = 0; j < cd; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    int choose = -1;
                    while (choose != 5) {
                        System.out.println("The conner at: ");
                        System.out.println("1.Top-left");
                        System.out.println("2.Botton-left");
                        System.out.println("3.Top-right");
                        System.out.println("4.Botton-right");
                        System.out.println("5.Exit");
                        choose = s.nextInt();
                        System.out.println("Chieu cao:");
                        int height = s.nextInt();
                        switch (choose) {
                            case 1:
                                for (int row = height; row >= 1; row--) {
                                    for (int col = 1; col <= row; col++) {
                                        System.out.print("* ");
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            case 2:
                                for (int row = 1; row <= height; row++) {
                                    for (int col = 1; col <= row; col++) {
                                        System.out.print("* ");
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            case 3:
                                for (int row = 1; row <= height; row++) {
                                    for (int col = 1; col <= height; col++) {
                                        if (col >= row) {
                                            System.out.print("* ");
                                        } else {
                                            System.out.print("  ");
                                        }
                                    }
                                    System.out.print("\n");
                                }

                                break;
                            case 4:
                                for (int row = 1; row <= height; row++) {
                                    for (int col = 1; col <= height; col++) {
                                        if (col <= height - row) {
                                            System.out.print("  ");
                                        } else {
                                            System.out.print("* ");
                                        }
                                    }
                                    System.out.print("\n");
                                }
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Chieu cao:");
                    int height = s.nextInt();
                    for (int i=1;i<=height;i++){
                        for (int j=height;j>i;j--){
                            System.out.print("  ");
                        }
                        for (int k=0;k<i*2-1;k++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
            }
        }
    }
}
