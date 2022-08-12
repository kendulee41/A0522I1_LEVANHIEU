package ss3_array.excercise.e8;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "levanhieu";
        System.out.println("String: "+str);
        System.out.println("Enter character: ");
        char c = s.next().charAt(0);
        int count =0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==c){
                count++;
            }
        }

        System.out.println("The number of occurrences: "+count);
    }
}
