package src.practiceproblems;

import java.util.Scanner;

public class PalindromeChecking {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter String to check palindrome");
        String str = s.nextLine();
        int k = 1;

        int h = str.length() - 1, l = 0;

        while (h > l) {
            if (str.charAt(h) != str.charAt(l)) {
                k = 0;
                break;
            }
            h--;
            l++;

        }

        if (k == 0) {
            System.out.println("Entered string " + str + "  is NOT palindrme");
        } else {
            System.out.println("Entered string " + str + "  is  palindrme");
        }

    }

}
