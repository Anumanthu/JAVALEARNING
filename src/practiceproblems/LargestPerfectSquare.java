package src.practiceproblems;

public class LargestPerfectSquare {

    public static void main(String[] args) {

        // int a[] = { 64, 5, 7, 121, 9, 4, 10, 45, 64, 144, 81, 78, 56 };

        int a[] = {5, 7, 10};

        System.out.println("Maximum perfect square is " + findLargestSquare(a));

    }

    public static int findLargestSquare(int a[]) {
        int maxi = -1;

        for (int i = 0; i < a.length; i++) {
            if (isPerfectsqaure(a[i])) {
                maxi = Math.max(a[i], maxi);
            }
        }
        return maxi;
    }

    public static boolean isPerfectsqaure(double n) {
        double d = Math.sqrt(n);
        if (d * d == n)
            return true;

        return false;
    }

}
