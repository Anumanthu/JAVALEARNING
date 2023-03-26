package src.practiceproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharactersfromStrings {

    public static void main(String[] args) {


        // Java program to remove duplicate character
// from character array and print in sorted
// order
        //Not implemented fully...re think on this solution
        String str = "geeks for geeks";
        //System.out.println(removeDuplicates(str));
        String str1[] = str.split(" ");

        for (int i = 0; i < str.length(); i++)
            System.out.print(String.valueOf(removeDuplicatesHashSet(str1[i]).toString()));

    }


    public static List removeDuplicatesHashSet(String str) {
        Set<Character> set = new HashSet<Character>();
        ArrayList<Character> al = new ArrayList<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (!set.contains(str.charAt(i)) || str.charAt(i) == ' ') {
                set.add(str.charAt(i));
                al.add(str.charAt(i));
            }
        }
        return al;
    }

    public static String removeDuplicates(String str) {
        ArrayList<Character> al = new ArrayList<Character>();
        char ch[] = null;

        //str.replace("g", "");
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            if (al.contains(str.charAt(i))) {
                //str.replace(String.valueOf(str.charAt(i)), "$");
                //System.out.println(str);

            } else {
                al.add(str.charAt(i));
                ch[j++] = str.charAt(i);
            }
        }


        return str;
    }


}
