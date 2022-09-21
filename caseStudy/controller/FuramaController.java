package caseStudy.controller;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("select function: ");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    EmployeeController.employeeMenu();
                    break;
                case 2:
                    CustomerController.customerMenu();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    System.exit(0);
            }
        }
    }
}
