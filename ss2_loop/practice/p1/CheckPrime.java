package ss2_loop.practice.p1;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        if (number<2){
            System.out.println(number+" is not Prime");
        }else {
            boolean check = true;
            for (int i=2;i<=Math.sqrt(number);i++){
                if (number%i==0){
                    check = false;
                }
            }
            if (check){
                System.out.println(number+" is Prime");
            }else {
                System.out.println(number+" is not Prime");
            }
        }
    }
}
