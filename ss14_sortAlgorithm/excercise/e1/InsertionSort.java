package ss14_sortAlgorithm.excercise.e1;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = Integer.parseInt(sc.nextLine());
        int[] list = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter  value "+(i+1)+":");
            list[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("First your list: ");
        for (int value : list){
            System.out.printf(value+"\t");
        }
        System.out.println();
        insertionSort(list);
    }
    private static void insertionSort(int[] list){
        int pos, x;
        for(int i = 1; i < list.length; i++){
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
            System.out.printf("\nloop "+i+":\t");
            for (int value : list){
                System.out.printf(value+"\t");
            }
        }
    }
}
