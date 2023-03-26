package src.practiceproblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NoOfDuplicateWordsInString {

    public static void main(String[] args) {

        String str = "anumanthu is divya divya anumanthu divya is nandini ram ramse is good and good";

        System.out.println("Given word is " + str);

        duplicateWords(str);

    }

    public static void duplicateWords(String str) {

        String[] str1 = str.split(" ");

        HashMap<String, Integer> WordCount = new HashMap<String, Integer>();

        for (String str2 : str1) {
            if (WordCount.containsKey(str2)) {
                WordCount.put(str2, WordCount.get(str2) + 1);
            } else {
                WordCount.put(str2, 1);
            }
        }

        Set<Entry<String, Integer>> s = WordCount.entrySet();

        Iterator<Entry<String, Integer>> itr = s.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> me = (Entry<String, Integer>) itr.next();

            if (me.getValue() > 1) {
                System.out
                        .println("Found duplicate word-->" + me.getKey() + " is repeated " + me.getValue() + " times");
            }
        }

        // 2nd way using KeySet method
        Set<String> s1 = WordCount.keySet(); // It will store all the keys in Set collection

        Iterator<String> itr1 = s1.iterator();

        while (itr1.hasNext()) {

            String str2 = itr1.next();
            if (WordCount.get(str2) > 1) {
                System.out.println("Found duplicate word-->" + str2 + " is repeated " + WordCount.get(str2) + " times");

            }

        }

    }
}
