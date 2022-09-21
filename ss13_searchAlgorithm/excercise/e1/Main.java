package ss13_searchAlgorithm.excercise.e1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = sc.nextLine();
        String maxString = "";
        for (int i=0;i<input.length();i++){
            String string = "";
            char indexFirst = input.charAt(i);
            string = string + indexFirst;
            for (int j = i+1; j < input.length(); j++) {
                if (input.charAt(j) > indexFirst) {
                    indexFirst = input.charAt(j);
                    string += indexFirst;
                }
            }
            if (string.length()>maxString.length()){
                maxString = string;
            }
        }
        System.out.println(maxString);
    }
}
