package src.practiceproblems;

import java.util.Arrays;

public class Sort2DArray {

    public static void main(String[] args) {

        int[][] arr = {{4, 9}, {1, 5}, {2, 6}};

        sort2Darray(arr);
    }

    public static void sort2Darray(int arr[][]) {

        int m = 0;
        m = arr.length;
        int n = 2;

        int[] arr2 = new int[m];
        int[] arr3 = new int[m];
        int k = 0, l = 0;

        System.out.println(m);
        try {
            for (int i = 0; i < m; i++) {
                arr2[k] = arr[i][0];
                arr3[l] = arr[i][1];
                k++;
                l++;
            }
            Arrays.sort(arr2);
            Arrays.sort(arr3);
        } catch (Exception e) {
            System.out.println("Exception occured    --" + e);
        }

        int a = 0, b = 0;
        try {
            for (int i = 0; i < m; i++) {
                arr[a][0] = arr2[i];
                arr[a][1] = arr3[i];
                a++;
            }
        } catch (Exception e) {
            System.out.println("Exception occured2    --" + e);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
