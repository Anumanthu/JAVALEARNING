package src.practiceproblems;

import java.util.HashSet;

public class MinimumSubStringwithallCharacters {

    public static void main(String[] args) {


        String str = "AABBBCBB";//expected result 6 ....since ABBBCB is the minimum substring which contains all the characters

        System.out.println(str.length());

        System.out.println(findMinimumwindow(str));

    }

    public static int DistinctLength(String str) {

        HashSet<Character> hs = new HashSet<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (!hs.contains(str.charAt(i))) {
                hs.add(str.charAt(i));
            } else {
                continue;
            }
        }
        return hs.size();
    }

    public static int findMinimumwindow(String str) {
        int max_distinct = DistinctLength(str);

        String str2 = null;

        int minLength = str.length();

        for (int i = 0; i < str.length(); i++) {
            for (int j = max_distinct - 2; j < str.length(); j++) {
                String substr = str.substring(i, j);
                int sub_length = substr.length();
                int max_distinct2 = DistinctLength(substr);

                if (max_distinct == max_distinct2) {
                    minLength = sub_length;
                    str2 = str.substring(i, j);

                }
            }
        }

        System.out.println(str2);

        return minLength;

    }

}
