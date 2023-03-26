package src.practiceproblems;

//{ Driver Code Starts
//Initial Template for Java

import java.io.IOException;
import java.util.Scanner;

class ProductArray {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}


//} Driver Code Ends


//User function Template for Java


class Solution {
    public static long[] productExceptSelf(int nums[], int n) {
        // code here
        long MaxProduct = 1;
        long[] lng = new long[n];
        boolean zero = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = true;
                count++;
            } else {
                MaxProduct = MaxProduct * nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0 && count <= 1) {
                //System.out.print(MaxProduct+" ");
                lng[i] = MaxProduct;
            } else if (nums[i] == 0 && count > 1) {
                //System.out.print(0+" ");
                lng[i] = 0L;
            } else if (nums[i] != 0 && count == 0) {
                //System.out.print((MaxProduct/nums[i])+" ");
                lng[i] = MaxProduct / nums[i];
            } else if (nums[i] != 0 && count != 0) {
                // System.out.print(0+" ");
                lng[i] = 0L;
            }
        }
        return lng;

    }
} 
