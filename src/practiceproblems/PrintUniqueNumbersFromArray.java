package src.practiceproblems;

import java.util.*;
import java.util.Map.Entry;

public class PrintUniqueNumbersFromArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        //int a[]=new int[11];
        int[] a = {1, 2, 7, 8, 5, 9, 2, 7, 5, 4, 4};
        //Integer b=new Integer(0);


        List<Integer> b = Arrays.asList(1, 2, 7, 8, 5, 9, 2, 7, 5, 4, 4, 5, 5, 6);


        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int k : b) {

            if (!hm.containsKey(k)) {
                hm.put(k, 1);
            } else {
                hm.put(k, hm.get(k) + 1);
            }
        }
        Set<Entry<Integer, Integer>> s = hm.entrySet();
        Iterator itr = s.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> me = (Entry<Integer, Integer>) itr.next();
            System.out.println("Key =  " + me.getKey() + " Value " + me.getValue());
        }

    }

}
