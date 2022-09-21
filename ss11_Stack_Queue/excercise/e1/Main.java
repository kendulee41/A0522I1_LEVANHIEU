package ss11_Stack_Queue.excercise.e1;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        reverseInteger();
        System.out.println("\n===============");
        reverseString();
    }

    private static void reverseString() {
        String str = "hieu";
        Stack<String> wStack = new Stack<String>();
        String outp = "";
        for (int i = 0; i < str.length(); i++) {
            wStack.push(String.valueOf(str.charAt(i)));
        }
        int size = wStack.size();
        for (int i = 0; i < size; i++) {
            outp += wStack.pop();
        }
        System.out.println("Reversed Array: '" + outp+"'");
    }

    private static void reverseInteger() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
}
