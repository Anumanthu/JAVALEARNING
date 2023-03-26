package practiceproblems;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println("Enter any number to print Fibonacci series upto   ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int fb1 = 0, fb2 = 1, temp = 0;


        System.out.print("0 1");


        for (int i = 0; i < n && fb1 + fb2 < n; i++) {
            temp = fb1 + fb2;
            System.out.print(" " + temp);
            fb1 = fb2;
            fb2 = temp;
        }


    }

}
