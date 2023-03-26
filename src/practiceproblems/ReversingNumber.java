package practiceproblems;

import java.util.Scanner;

public class ReversingNumber {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter Number to reverse");
        int num = s.nextInt();
        int original = num;
        int reminder, ReverseNum = 0;

        while (num > 0) {
            reminder = num % 10;
            ReverseNum = ReverseNum * 10 + reminder;
            num = num / 10;
        }

        System.out.println("The reversed number of " + original + "  is  " + ReverseNum);


    }

}
