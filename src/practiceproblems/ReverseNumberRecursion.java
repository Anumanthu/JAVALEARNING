package src.practiceproblems;

public class ReverseNumberRecursion {
    static int sum = 0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 72398476;

        System.out.println("Reverse of a number is " + reverseRecursive(n));
        //System.out.println("Reverse of a number is "+sum);

    }

    public static int reverseRecursive(int n) {
        return reverseRecursive(n, 0);
    }

    public static int reverseRecursive(int n, int sum) {
        if (n > 0) {
            sum = (sum * 10) + (n % 10);
            return reverseRecursive(n / 10, sum);

        }
        return sum;
    }

}
