package src.practiceproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortGroupOfCharsDigits {

    public static void main(String[] args) {

//		Input: str = �121geeks21�
//		Output: 112eegks12

        String str = "121geeks21";
        //String str = "2";

        List<String> str1 = getGroupOfStrings(str);

        for (int i = 0; i < str1.size(); i++) {
            char sortString[] = str1.get(i).toCharArray();
            Arrays.sort(sortString);
            System.out.print(String.valueOf(sortString));
        }
    }

    private static List<String> getGroupOfStrings(String str) {
        List<String> str1 = new ArrayList<String>();
        char prev = str.charAt(0), current;
        int k = 0, start_Index = 0, end_Index = 0;

        for (int i = 1; i < str.length(); i++) {

            if (isDigit(str.charAt(i)) != isDigit(prev)) {
                prev = str.charAt(i);
                end_Index = i;
                str1.add(str.substring(start_Index, end_Index));
                start_Index = end_Index;
            }
        }

        if (end_Index < str.length()) {
            str1.add(str.substring(end_Index));
        }
        return str1;

    }

    public static boolean isDigit(char c) {
        return Character.isDigit(c);
    }

}
