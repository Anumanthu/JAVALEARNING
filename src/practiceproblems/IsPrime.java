package practiceproblems;

public class IsPrime {

    public static void main(String[] args) {


        IsPrime P = new IsPrime();
        System.out.println("Prime number   " + P.isPrime(10));
        System.out.println("Prime number   " + P.isPrime(3));


    }

    boolean isPrime(int n) {
        boolean primenumber = true;
        if (n <= 1) {
            primenumber = false;
            return primenumber;

        }
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0)
                primenumber = false;
            break;
        }
        return primenumber;
    }


}
