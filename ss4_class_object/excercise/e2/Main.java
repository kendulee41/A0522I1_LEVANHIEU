package ss4_class_object.excercise.e2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int  i = 0; i < arr.length - 1; i++){
            min = i;
            for(int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime()+" mls");
    }
}
