package src.practiceproblems;


import java.util.ArrayList;

public class LargestSubArraySum {


    public static void main(String args[]) {

//                Input:
//                N = 5, S = 12
//                A[] = {1,2,3,7,5}
//                Output: 2 4
//                Explanation: The sum of elements
//                from 2nd position to 4th position
//                is 12.

/* 
 * Solution : Efficient Approach: There is an idea if all the elements of the array are positive.
        If a subarray has sum greater than the given sum then there is no possibility that adding elements to the current subarray the sum will be x (given sum).
        Idea is to use a similar approach to a sliding window. Start with an empty subarray, add elements to the subarray until the sum is less than x.
        If the sum is greater than x, remove elements from the start of the current subarray.
Algorithm:

Create two variables, l=0, sum = 0
Traverse the array from start to end.
Update the variable sum by adding current element, sum = sum + array[i]
If the sum is greater than the given sum, update the variable sum as sum = sum � array[l], and update l as, l++.
If the sum is equal to given sum, print the subarray and break the loop.

*/


        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = {68, 100, 36, 95, 104, 12, 123, 134};
        //int[] arr = {1, 2, 3, 7, 5};
        System.out.println("List is  " + subarraySum(arr, 8, 468));
    }

    public static ArrayList<Integer> subarraySum(int arr[], int n, long s) {
        ArrayList<Integer> lst = new ArrayList<>();
        //Handling edge/corner cases
        if (s <= 0) {
            lst.add(-1);
            return lst;
        }
        int TotalSum = 0, l = 0;
        boolean flag = false;
        int i;
        for (i = 0; i < n; i++) {

            if (TotalSum == s) {
                flag = true;
                break;
            }

            if (TotalSum + arr[i] >= s) {
                if (TotalSum + arr[i] == s) {
                    i++;
                    flag = true;
                    break;
                } else {
                    TotalSum = TotalSum - arr[l];
                    l++;
                }
            }
            TotalSum = TotalSum + arr[i];
            if (TotalSum > s) {
                TotalSum = TotalSum - arr[l];
                l++;
            }

            //Handling edge/corner cases
            if (TotalSum == s && i == n - 1) {
                i++;
                flag = true;
                break;
            }

        }
        if (flag) {
            lst.add(l + 1);
            lst.add(i);
        } else {
            lst.add(-1);
        }
        return lst;
    }

}

