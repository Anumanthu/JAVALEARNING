package src.practiceproblems;

import java.util.HashSet;

/* It is basically a function with domain and co-domain as natural numbers and 0. It is recursively defined as below: 
Specifically, let a(n) denote the (n+1)-th term. (0 is already there). 
The rule says: 

  a(0) = 0,
if n > 0 and the number is not 
   already included in the sequence,
     a(n) = a(n - 1) - n 
else 
     a(n) = a(n-1) + n. */

class RecamanSequence {

    public static void main(String[] args) {
        int n = 17;
        recaman(n);
    }

    // Prints first n terms of Recaman sequence
    public static void recaman(int n) {
        if (n <= 0)
            return;

        // Print first term and store it in a hash
        System.out.print(0 + " ");
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(0);

        // Print remaining terms using
        // recursive formula.
        int prev = 0;
        for (int i = 1; i < n; i++) {
            int curr = prev - i;

            // If arr[i-1] - i is negative or
            // already exists.
            if (curr < 0 || s.contains(curr))
                curr = prev + i;

            s.add(curr);

            System.out.print(" " + curr);
            prev = curr;
        }
    }

}