package src.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightedUniformString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


//		Given a string, , let  be the set of weights for all possible uniform contiguous substrings of string .
//		There will be  queries to answer where each query consists of a single integer.
//		Create a return array where for each query, the value is Yes if . Otherwise, append No.
//		Example
//		Working from left to right, weights that exist are:
//
//		string  weight
//		a       1
//		b       2
//		bb      4
//		c       3
//		cc      6
//		ccc     9
//		d       4
//		dd      8
//		ddd     12
//		dddd    16
//		Now for each value in , see if it exists in the possible string weights.
//		The return array is ['Yes', 'No', 'No', 'Yes', 'No'].

        String s = "abbcccdddd";
        List<Integer> queries = Arrays.asList(1, 7, 5, 4, 15);
        System.out.println(weightedUniformStrings(s, queries));
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here

        List<Integer> retList = new ArrayList<Integer>();
        List<String> retListFlag = new ArrayList<String>();
        String pos = "abcdefghijklmnopqrstuvwxyz";

        // char c1[]=s.toCharArray();
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            start = i;
            end = i;
            while ((i + 1) < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                end = i + 1;
                i = i + 1;
            }
            int add = 0;
            add = pos.indexOf(s.charAt(i)) + 1;
            retList.add(add);
            for (int k = 1; k <= end - start; k++) {
                //add = add + pos.indexOf(s.charAt(i)) + 1;
                retList.add(add * (k + 1));
            }
        }
        //for (int l : queries) {
        queries.stream().parallel().forEachOrdered(l -> {
            if (retList.contains(l)) {
                retListFlag.add("Yes");
            } else {
                retListFlag.add("No");
            }
        });
        return retListFlag;
    }

}
