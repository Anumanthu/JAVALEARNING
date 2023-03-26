package src.practiceproblems;

public class KthSmallestNo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static int kthSmallest(int A[]) {
        int smallest = 9999999, smallest2;
        int n = A.length;
        int k = 3, k1 = 1;


        for (int i = 0; i < n; i++) {
            if (A[i] < smallest)
                smallest = A[i];
        }


        for (int i = 0; i < n; i++) {
            if (A[i] < smallest)
                smallest = A[i];
        }

        return 0;

    }

}
