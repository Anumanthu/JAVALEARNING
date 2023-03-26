package src.practiceproblems;

class IntegerKpositionInBinarySearch {

   /* Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

    Example 1:

    Input:
    N = 5
    arr[] = {1 2 3 4 5}
    K = 4
    Output: 3
    Explanation: 4 appears at index 3.
*/

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.print("postion of K is " + binarysearch(arr, 11, 10));
    }

    public static int binarysearch(int arr[], int n, int k) {
        // code here
        int mid = 0, start = 0, end = n - 1;
        mid = mid + (end - mid) / 2;

        while (start <= end) {
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] > k) {
                end = mid - 1;
                mid = (end - mid) / 2;
            } else {
                mid = mid + 1;
                start = mid;
                mid = (end + mid) / 2;
            }
        }
        return -1;
    }
}
