package ss11_Stack_Queue.excercise.e3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> myStack = new Stack();
        System.out.println("Enter number:");
        int num = Integer.parseInt(sc.nextLine());
        while (num!=0){
                myStack.push(num%2);
                num /=2;
        }
        System.out.println("Result: ");
        for (int i=0;i<myStack.size();i++){
            System.out.printf(myStack.pop()+" ");
        }
    }
}
