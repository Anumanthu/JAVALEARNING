package practiceproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateStrings {

    public static void main(String[] args) {


        String[] s = {"JAVA", "SELENIUM", "C", "JAVA", "C", "QTP", "TESTNG", "WEBDRIVER", "JAVA"};

        int count = 1;

        Set hs = new HashSet();


        for (int i = 0; i < s.length; i++) {


            if (hs.contains(s[i])) {


                if (count == 1) {
                    System.out.println("The duplicate string is  " + s[i]);
                    hs.remove(s[i]);

                }
                count++;


            } else {
                hs.add(s[i]);
                //count=1;
            }
        }


        System.out.println("*************************************************************************");

        HashMap<String, Integer> hm = new HashMap<String, Integer>();


        for (int i = 0; i < s.length; i++) {

            Integer count1 = hm.get(s[i]);

            if (count1 == null)
                hm.put(s[i], 1);

            else
                hm.put(s[i], ++count1);

        }


        Set<Entry<String, Integer>> entry = hm.entrySet();


        Iterator it = entry.iterator();

        while (it.hasNext()) {
            Object str = it.next();

            //entry).getValue();
            int a = ((Entry<String, Integer>) str).getValue();

            if (a > 1)
                System.out.println("The duplicate string is  " + ((Entry<String, Integer>) str).getKey() + " " + ((Entry<String, Integer>) str).getValue());


        }

    }

}
