package src.practiceproblems;

import java.io.IOException;
import java.util.Scanner;

public class FindSuperDigit {

    /*
     * // Complete the superDigit function below.//means int Here n=123 and k=3, so
     * . P=123123123
     *
     * super_digit(P) = super_digit(123123123) = super_digit(1+2+3+1+2+3+1+2+3) =
     * super_digit(18) = super_digit(1+8) = super_digit(9) = 9
     */

    private static final Scanner scanner = new Scanner(System.in);

    static long superDigit(String n, int k) {
        String n1 = n;
        for (int i = 0; i < k - 1; i++) {
            n = n.concat(n1);
        }
        long val = Long.parseLong(n);

        while (val % 10 != val) {
            long val1 = 0;
            while ((val / 10) != 0) {
                val1 = val1 + val % 10;
                val = val / 10;
            }
            val = val1 + val;
        }
        return val;
    }

    //2nd way to find
    static int superDigit2(String n, int k) {
        String n1 = n;
        for (int i = 0; i < k - 1; i++) {
            n = n.concat(n1);
        }
        while (n.length() != 1) {
            int sum = 0;
            for (Character ch : n.toCharArray()) {
                sum = sum + Integer.parseInt(String.valueOf(ch));
            }
            n = String.valueOf(sum);
        }
        return Integer.parseInt(n);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(superDigit("1482", 3));
        System.out.println(superDigit2("1482", 3));
    }
}
