package src.practiceproblems;

import java.util.Arrays;

public class RotateArray {

    public static void main(String args[]) {

        int N = 5, D = 2;
        int arr[] = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(rotateArr(arr, D, N)));

        // System.out.println(Arrays.toString(arr));
    }

    // Function to rotate an array by d elements in counter-clockwise direction.
    static int[] rotateArr(int arr[], int d, int n) {
        // add your code here
        int arr1[] = new int[arr.length];
        // arr1=arr;
        int k = d, k1 = 0;

        for (int i = 0; d + i < n; i++) {
            arr1[k1++] = arr[k++];
        }
        for (int i = 0; i < d; i++) {
            arr1[k1++] = arr[i];
        }
        arr = arr1;
        return arr;
    }
}