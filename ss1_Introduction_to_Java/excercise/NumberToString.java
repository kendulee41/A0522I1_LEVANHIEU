package ss1_Introduction_to_Java.excercise;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        String result = "";
        String tens = "";
        String ones = "";
        String hundred = "";
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number < 0 || number > 999) {
            System.out.println("Error! Enter 3 digit number!");
            System.out.println("Enter number: ");
            number = scanner.nextInt();
        }
        int numberhundreds = number / 100;
        int numbertens = (number % 100) / 10;
        int numberones = (number % 100) % 10;
        switch (numberhundreds) {
            case 0:
                hundred = "";
                break;
            case 1:
                hundred = "One hundred";
                break;
            case 2:
                hundred = "Two hundred";
                break;
            case 3:
                hundred = "Three hundredd";
                break;
            case 4:
                hundred = "Four hundred";
                break;
            case 5:
                hundred = "Five hundred";
                break;
            case 6:
                hundred = "Six hundred";
                break;
            case 7:
                hundred = "Seven hundred";
                break;
            case 8:
                hundred = "Eight hundred";
                break;
            case 9:
                hundred = "Nine hundred";
                break;
        }
        if (numberhundreds != 0 && (number % 100) != 0) {
            hundred = hundred + " and";
        }
        switch (numbertens) {
            case 0:
            case 1:
                tens = "";
                break;
            case 2:
                tens = "Twenty";
                break;
            case 3:
                tens = "Thirty";
                break;
            case 4:
                tens = "Forty";
                break;
            case 5:
                tens = "Fifty";
                break;
            case 6:
                tens = "Sixty";
                break;
            case 7:
                tens = "Seventy";
                break;
            case 8:
                tens = "Eighty";
                break;
            case 9:
                tens = "Ninety";
                break;
        }
        if (numbertens == 1) {
            switch (numberones) {
                case 0:
                    ones = "Ten";
                    break;
                case 1:
                    ones = "Eleven";
                    break;
                case 2:
                    ones = "Twelve";
                    break;
                case 3:
                    ones = "Thirteen";
                    break;
                case 4:
                    ones = "Fourteen";
                    break;
                case 5:
                    ones = "Fifteen";
                    break;
                case 6:
                    ones = "Sixteen";
                    break;
                case 7:
                    ones = "Seventeen";
                    break;
                case 8:
                    ones = "Eighteen";
                    break;
                case 9:
                    ones = "Nineteen";
                    break;
            }
        }
        if (numbertens != 1) {
            switch (numberones) {
                case 0:
                    ones = "";
                    break;
                case 1:
                    ones = "One";
                    break;
                case 2:
                    ones = "Two";
                    break;
                case 3:
                    ones = "Three";
                    break;
                case 4:
                    ones = "Four";
                    break;
                case 5:
                    ones = "Five";
                    break;
                case 6:
                    ones = "Six";
                    break;
                case 7:
                    ones = "Seven";
                    break;
                case 8:
                    ones = "Eight";
                    break;
                case 9:
                    ones = "Nine";
                    break;
            }
        }
        result = hundred + " " + tens + " " + ones;
        System.out.println("Result: " + result);
        }
}
