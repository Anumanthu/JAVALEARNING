package src.practiceproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CamelCaseWords {


    public static void main(String[] args) {
        String str = "FatherMaleMotherFemale";    // O/P Father Male Mother Female
        int begin = 0;
        int end = 0;
        List<String> ls = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                if (begin != end) {
                    ls.add(str.substring(begin, end));
                    begin = end;
                }
            } else {
                if (end == str.length() - 1) {
                    ls.add(str.substring(begin));
                }
            }
            end++;
        }
        System.out.println(ls);


        // String regx = "[A-Z]";
//        Pattern p = Pattern.compile(regx);
//        Matcher m = p.matcher(str);
//        String[] strs = new String[0];
//        while (m.find()) {
//            strs = p.split(str);
//        }

        // String str = "FatherMaleMotherFemale";    // O/P Father Male Mother Female
        String[] strs = str.split("[A-Z]");
        for (String st : strs) {
            if (!st.isEmpty()) {
                st = str.charAt(str.indexOf(st) - 1) + st;
                System.out.println(st);
            }
        }
        //Arrays.stream(strs).forEach(System.out::println);


        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c) && i != 0) {
                if (str1.length() == 0) {
                    str1 = str1 + str.substring(0, i) + " ";
                } else {
                    str1 = str1 + str.substring(str1.replaceAll("\\s", "").length() - 1, i) + " ";
                }
            } else {
                if (i == str.length() - 1) {
                    str1 = str1 + str.substring(str1.length() - 1);
                }
            }
        }
        System.out.println(Arrays.toString(str1.split(" ")));


    }
}

