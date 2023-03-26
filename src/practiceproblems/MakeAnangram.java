package src.practiceproblems;

import java.util.HashMap;
import java.util.Set;

//import org.codehaus.plexus.util.CollectionUtils;

public class MakeAnangram {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Count the no of characters needs to be delete to make both the strings are anagrams

//		String str1="cde";
//		String str2="abc";  //in this case it is 4 since 2 from str1 2 from str2

        String str1 = "fcrxzwscanmligyxyvym";
        String str2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        //Below is very simple logic please go through it
        System.out.println("No of deletions is " + makeAnagrams(str1, str2));

        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();


        int counter = 0;
        int i = 0;
        int lenght = Math.max(str1.length(), str2.length());

        //List<char[]>lst=Arrays.asList(str1.toCharArray());

        while (i < str1.length() && i < str2.length()) {
            if (hm1.containsKey(str1.charAt(i))) {
                hm1.put(str1.charAt(i), hm1.get(str1.charAt(i)) + 1);
            } else {
                hm1.put(str1.charAt(i), 1);
            }
            if (hm2.containsKey(str2.charAt(i))) {
                hm2.put(str2.charAt(i), hm2.get(str2.charAt(i)) + 1);
            } else {
                hm2.put(str2.charAt(i), 1);
            }
            i++;
        }

        while (i < str1.length()) {
            if (hm1.containsKey(str1.charAt(i))) {
                hm1.put(str1.charAt(i), hm1.get(str1.charAt(i)) + 1);
            } else {
                hm1.put(str1.charAt(i), 1);
            }
            i++;
        }


        while (i < str2.length()) {
            if (hm2.containsKey(str2.charAt(i))) {
                hm2.put(str2.charAt(i), hm2.get(str2.charAt(i)) + 1);
            } else {
                hm2.put(str2.charAt(i), 1);
            }
            i++;
        }

        //int lenght1=Math.max(hm1.size(),hm2.size());


        Set<Character> keys1 = hm1.keySet();
        for (char c : keys1) {
            if (hm2.containsKey(c)) {
                counter = counter + Math.abs(hm1.get(c) - hm2.get(c));
                hm2.remove(c);
            } else {
                counter = counter + hm1.get(c);
            }
        }

        Set<Character> keys = hm2.keySet();
        for (char c : keys) {
            if (hm1.containsKey(c)) {
                counter = counter + Math.abs(hm1.get(c) - hm2.get(c));
                hm1.remove(c);

            } else {
                counter = counter + hm2.get(c);
            }
        }
        System.out.println(" No of chars to delete is " + counter);

    }

    public static int makeAnagrams(String str1, String str2) {

//        String str1 = "fcrxzwscanmligyxyvym";
//        String str2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            a1[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            a2[str2.charAt(i) - 'a']++;
        }
        int no = 0;
        for (int i = 0; i < 26; i++) {

            no = no + Math.abs(a1[i] - a2[i]);
        }
        return no;
    }

}
