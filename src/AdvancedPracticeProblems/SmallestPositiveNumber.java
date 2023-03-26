package src.AdvancedPracticeProblems;

/*Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000]*/

public class SmallestPositiveNumber {

    public static void main(String[] args) {

        //int a[]= {1, 3, 6, 4, 1, 2};

        //int a[]= {1, 2,3};
        //int a[]= {-1,-4,-3};

        int a[] = {-1, -4, -3, 89, 67, 1, 2};

        System.out.println("\nSmallest +ve number is --> " + smallestPosInteger(a));


    }

    public static int smallestPosInteger(int a[]) {
        int n = a.length;

        boolean[] b = new boolean[n + 1];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] <= n) {
                b[a[i]] = true;
            }
        }

        for (int i = 0; i <= n; i++) {
            System.out.print(" " + b[i]);
        }


        for (int i = 1; i <= n; i++) {
            if (!b[i]) {
                return i;
            }
        }


        return n + 1;

    }

}
