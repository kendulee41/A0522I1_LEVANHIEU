package ss10_List.excercise.e1;

import java.util.Random;
import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter capacity:");
        int capacity = s.nextInt();
        MyList myList = new MyList(capacity);
        Random random = new Random();
        int k;
        for (int i = 0; i < 6; i++) {
            k = random.nextInt(100);
            if (myList.add(k)) {
                System.out.println("success add " + k);
            } else {
                System.out.println("Error! not enough storage!\n" +
                        "Enter 1 to extend, 2 to skip");
                int check = s.nextInt();
                if (check == 1) {
                    myList.ensureCapacity(capacity * 2);
                    myList.add(k);
                    System.out.println("success add " + k);
                }
            }
        }
        for (int j = 0; j < myList.size(); j++) {
            System.out.printf("%3d", myList.get(j));
        }
        System.out.println("\nin: /add: ");
        int i = s.nextInt();
        int a = s.nextInt();
        myList.add(i, a);
        for (int j = 0; j < myList.size(); j++) {
            System.out.printf("%3d", myList.get(j));
        }
        System.out.println("\nremove: ");
        int index = s.nextInt();
        myList.remove(index);
        for (int j = 0; j < myList.size(); j++) {
            System.out.printf("%3d", myList.get(j));
        }
    }
}
