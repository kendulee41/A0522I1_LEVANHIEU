package ss1_Introduction_to_Java.excercise;

import java.util.Scanner;

public class SaidHello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        String str = s.nextLine();
        System.out.println("Hello "+str);
    }
}
