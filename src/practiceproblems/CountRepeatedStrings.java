package src.practiceproblems;

import java.util.*;
import java.util.Map.Entry;

public class CountRepeatedStrings {

    public static void main(String[] args) {


        String str[] = {"Anumanth", "Rahul", "Rahul", "Rohit", "Anumanth", "Anumanth", "Anumanth", "Rahul"};

        countRepeatedStrings(str);

    }

    public static void countRepeatedStrings(String str[]) {

        ArrayList<String> al = new ArrayList<String>();

        for (int i = 0; i < str.length; i++) {
            al.add(str[i]);
        }
        //ArrayList<String> ad=new ArrayList<String>();

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (int i = 0; i < al.size(); i++) {
            if (hm.containsKey(al.get(i))) {
                hm.put(al.get(i), hm.get(al.get(i)) + 1);
            } else {
                hm.put(al.get(i), 1);

            }

        }
        System.out.println(hm);


        Set<Entry<String, Integer>> s = hm.entrySet();//Map.Entry<> or Entry<> are refers to same method in Map interface

        Iterator<Entry<String, Integer>> itr = s.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> mp = itr.next();

            System.out.println(mp.getKey() + " " + mp.getValue());

        }
    }
}


