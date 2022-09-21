package ss13_searchAlgorithm.excercise.e2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(5);
        list.sort((o1, o2) -> o1 - o2);
        System.out.println("Nhập số cần tìm:");
        int value = Integer.parseInt(sc.nextLine());
        int outPut = binarySearch(list, list.get(0), list.get(list.size() - 1), value);
        System.out.println(outPut);
    }

    private static int binarySearch(List<Integer> array, int left, int right, int value) {

        if (left>right){
            return -1;
        }else {
            int middle = (left + right) / 2;
            if (value == array.get(middle)) {
                return array.get(middle);
            } else if (value > array.get(middle)) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            return binarySearch(array,left,right,value);
        }
    }
}
