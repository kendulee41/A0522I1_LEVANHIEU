package _2_loop.excercise.e3;

public class prime_less_100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int n = 1;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    n++;
                }
            }
            if (n == 2) {
                System.out.printf("%5d", i);
            }
        }
    }
}
