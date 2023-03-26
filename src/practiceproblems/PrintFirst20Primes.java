package practiceproblems;

public class PrintFirst20Primes {

    public static void main(String[] args) {


        int i = 3, n = 20, primecount = 1;
        boolean primenumber = true;
        int a[] = new int[n];

        a[0] = 2;

        System.out.println("length" + a.length);
        System.out.println("first element" + a[0]);


        while (primecount < n) {

            for (int j = 0; j < primecount; j++) {
                if (i % (a[j]) == 0) {
                    primenumber = false;
                    break;
                }


            }
            if (primenumber) {
                a[primecount] = i;
                //System.out.println("Prime number "+i);
                primecount++;
            } else
                primenumber = true;
            i++;

        }

        System.out.println("Prime numbers are --->");

        for (int k = 0; k < n; k++) {
            System.out.print(" " + a[k]);

        }

    }

}
