package ss3_array.excercise.e1;


import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int k = 0; k < size; k++) {
            System.out.println("Array[" + k + "]=");
            arr[k] = sc.nextInt();
        }
        System.out.println("value to delete: ");
        int number = sc.nextInt();
        int index_del = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == number) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Not found");
        } else {
            for (int j = index_del; j < size-1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[size-1]=0;
            for (int index=0;index<size;index++){
                System.out.println(arr[index]+"\t");
            }
        }

    }
}
