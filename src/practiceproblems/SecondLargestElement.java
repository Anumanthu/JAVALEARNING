package practiceproblems;

public class SecondLargestElement {

    public final int INT_MIN = -999999;

    /* Driver program to test above function */
    public static void main(String args[]) {
        int arr[] = {12, 35, 1, 10, 34, 1};

        //int arr[] = {10,10,10};

        int n = arr.length;
        String abc = "abcdefght";
        abc.length();
        //Diffrence between length and length()
        //length gives size of integer array
        //length() gives size of the string array

        SecondLargestElement obj = new SecondLargestElement();

        obj.print2largest(arr, n);

    }

    /* Function to print the second largest elements */
    void print2largest(int arr[], int arr_size) {
        int i, first, second;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.println(" Invalid Input ");
            return;
        }

        first = second = INT_MIN;
        for (i = 0; i < arr_size; i++) {
	        /* If current element is smaller than first
	           then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

	        /* If arr[i] is in between first and
	           second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
        if (second == INT_MIN)
            System.out.println("There is no second largest element");
        else
            System.out.println("The second largest element is " + second);
    }

}
