package src.practiceproblems;

import java.util.Arrays;

class SortChars {

    // function to print string in sorted order
    static void sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }

    // Driver program to test above function
    public static void main(String[] args) {
        String s = "geeksforgeeks8894527";
        sortString(s);
    }
}