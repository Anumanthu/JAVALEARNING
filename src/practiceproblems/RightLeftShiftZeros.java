package src.practiceproblems;

import java.util.Arrays;

public class RightLeftShiftZeros {


    public static void main(String args[]) {
        int a[] = {1, 0, 0, 3, 7, 0, 3, 5, 0, 0, 0};

        System.out.println(Arrays.toString(shiftLeft(a)));
        System.out.println(Arrays.toString(shiftRight(a)));

    }

    public static int[] shiftLeft(int a[]) {
        int count = 0;
        int[] newArray = new int[a.length];

        for (int x : a) {
            if (x != 0) {
                newArray[count] = x;
                count++;
            }
        }
        return newArray;
    }

    public static int[] shiftRight(int a[]) {
        int count = a.length - 1;
        int[] newArray = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                newArray[count] = a[i];
                count--;
            }
        }
        return newArray;
    }
}
