package src.practiceproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class divisibleSumPairs {


    public static void main(String args[]) {

//        Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .
//
//        Example
//
//
//
//        Three pairs meet the criteria:  and .

/// Below code is incorrect please optimize the code
        int k = 2;
        int n = 5;
        Integer[] arr = new Integer[]{5, 9, 10, 7, 4};
        //ArrayList<Integer> al=new ArrayList<Integer>(arr);
        System.out.println(divisibleSumPairs(n, k, Arrays.asList(arr)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int rem = ar.get(i) % k;
            if (hm.containsKey(rem)) {
                hm.put(rem, hm.get(rem) + 1);
            } else {
                hm.put(rem, 1);
            }
            if (rem != 0) {
                if (hm.containsKey(k - rem))
                    if (rem < ar.get(i)) {
                        ans = ans + hm.get(k - rem) - 1;
                    } else {
                        ans = ans + hm.get(k - rem);
                    }
            } else if (hm.containsKey(0) && hm.get(0) > 1) {
                ans = ans + hm.get(0) - 1;
            }
        }
        return ans;
    }


}
