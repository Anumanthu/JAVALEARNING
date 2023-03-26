package src.practiceproblems;

import java.util.Stack;

public class ReverseStringParthesisIMP_STACKCollection {


    public static void main(String[] args) {


        String str = "(skeeg(for)skeeg)"; //skeegrofskeeg

        String rev = reverseParanthis(str);

        System.out.println("Reverse of a String is " + rev.replace("(", "").replace(")", ""));
    }

    public static String reverseParanthis(String str) {
        int startIndex = 0, endIndex = 0;
        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                s.push(i);
            } else if (str.charAt(i) == ')') {
                startIndex = s.pop();
                endIndex = i;
                str = str.substring(0, startIndex).concat(reverse(str.substring(startIndex, endIndex)).concat(str.substring(endIndex)));
            }
        }
        return str;
    }

    public static String reverse(String str) {
        if (str.length() < 2)
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

}
