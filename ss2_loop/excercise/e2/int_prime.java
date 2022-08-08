package _2_loop.excercise.e2;

public class int_prime {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        for (int i = 2; count < numbers; i++) {
            int n = 1;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    n++;
                }
            }
            if (n == 2) {
                System.out.printf("%5d", i);
                count++;
            }
        }
    }
}
