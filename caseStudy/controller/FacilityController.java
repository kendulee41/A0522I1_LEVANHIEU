package caseStudy.controller;

import java.util.Scanner;

public class FacilityController {
    private static Scanner sc = new Scanner(System.in);
    public static void facilityMenu(){
        while (true){
            System.out.println("select function: ");
            System.out.println("1.\tDisplay list facility");
            System.out.println("2.\tAdd new facility");
            System.out.println("3.\tDisplay list facility maintenance");
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
