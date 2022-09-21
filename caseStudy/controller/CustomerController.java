package caseStudy.controller;

import java.util.Scanner;

public class CustomerController {
    private static Scanner sc = new Scanner(System.in);
    public static void customerMenu(){
        while (true){
            System.out.println("select function: ");
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4.\tReturn main menu");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                    return;
            }
        }
    }
}
