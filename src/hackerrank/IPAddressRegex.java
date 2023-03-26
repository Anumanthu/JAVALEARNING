package src.hackerrank;

import java.util.regex.Pattern;

public class IPAddressRegex {


    public static void main(String[] args) {

        //Refer below link for more info about Java regex
        //https://www.javatpoint.com/java-regex

        //Valid ip's
//        000.12 .12 .034
//        121.234 .12 .12
//        23.45 .12 .56
//
//
//        //Invalid ip's
//        000.12 .234 .23 .23
//        666.666 .23 .23
//        .213 .123 .23 .32
//        23.45 .22 .32.
//                I.Am.not.an.ip

        String IP = " 121.234.12.12";

        String regex1 = "(\\d{1,2}|[0-1]\\d{2}|[2][0-4]\\d|25[0-5])";
        String pattern = regex1 + "." + regex1 + "." + regex1 + "." + regex1;

        if (Pattern.matches(pattern, IP))
            System.out.println("IP address is valid");
        else
            System.out.println("IP address is in valid");
    }
}
