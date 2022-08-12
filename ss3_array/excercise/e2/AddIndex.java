package ss3_array.excercise.e2;

import java.util.Scanner;

public class AddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<size;i++){
            System.out.println("Array["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("value to add:");
        int value = sc.nextInt();
        System.out.println("index to add:");
        int index = sc.nextInt();
        for (int i=size-1;i>index;i--){
            arr[i] = arr[--i];
        }
        arr[index] = value;
        for (int i =0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}