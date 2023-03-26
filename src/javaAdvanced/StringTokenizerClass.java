package javaAdvanced;

import java.util.StringTokenizer;

public class StringTokenizerClass {

    public static void main(String[] args) {

        String s = "Welcome to selenium Learning";

        StringTokenizer st = new StringTokenizer(s);

        System.out.println(st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }


    }


}
