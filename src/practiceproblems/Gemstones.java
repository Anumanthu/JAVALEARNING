package src.practiceproblems;

import java.util.List;

public class Gemstones {


    public static void main(String[] args) {

        String[] str = {"basdfj",
                "asdlkjfdjsa",
                "bnafvfnsd",
                "oafhdlasd"};
        System.out.println("No of Gems " + gemStones(str));
    }

    public static int gemStones(String[] arr) {

        String s = "abcdefghijklmnopqrstuvwxyz";
        boolean flag = true;
        int count = 0;
        for (char ch : s.toCharArray()) {
            flag = true;
            for (String st : arr) {
                if (!st.contains(String.valueOf(ch))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }


    public static String twoStrings(String s1, String s2) {

        if (!s1.isEmpty() && !s2.isEmpty() && !s1.isBlank() && !s2.isBlank()) {
            if (s1.length() > s2.length()) {
                for (char ch : s1.toCharArray()) {
                    if (s2.contains(String.valueOf(ch))) {
                        return "YES";
                    }
                }
            } else {
                for (char ch : s2.toCharArray()) {
                    if (s1.contains(String.valueOf(ch))) {
                        return "YES";
                    }
                }
            }
        }
        return "NO";
    }


    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        final long[] sum = {0};
        ar.parallelStream().forEach(s -> {
            sum[0] = sum[0] + s;
        });
        return sum[0];

    }


    public static void plusMinus(List<Integer> arr) {
        // Write your code here


    }

}
