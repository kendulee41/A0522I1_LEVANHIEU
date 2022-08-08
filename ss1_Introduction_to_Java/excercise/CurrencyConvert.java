package ss1_Introduction_to_Java.excercise;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner s = new Scanner(System.in);
        System.out.println("USD: ");
        int usd = s.nextInt();
        System.out.println("VNĐ: "+usd*rate);
    }
}
