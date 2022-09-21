package caseStudy.controller;

import java.util.Scanner;

public class EmployeeController {
    private static Scanner sc = new Scanner(System.in);
    public static void employeeMenu(){
        while (true){
            System.out.println("select function: ");
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
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
