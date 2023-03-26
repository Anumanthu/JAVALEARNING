package src.practiceproblems;

import java.util.regex.Pattern;

public class IPAddressValidation {
    public static int i = 1;
    public static int A[] = {2, 4, 9, 6, 8, 5, 3, 7, 1};

    public static void main(String args[]) {

        String str = "10.00.00.254";
        System.out.println(isValid(str));
        System.out.println(isValidIP(str));

    }

    public static boolean isValid(String s) {
        // Write your code here
        if (s.equalsIgnoreCase("0.0.0.0")) {
            return true;

        }
        int count = 0;
        String str[] = s.split("[.]");
        if (str.length == 4) {
            for (int i = 0; i < 4; i++) {
                if (!(str[i].isEmpty())) {
                    if ((str[i].startsWith("0"))) {
                        if (!str[i].endsWith("0"))
                            return false;
                    }

                    int n;
                    try {
                        n = Integer.parseInt(str[i]);
                        if (n == 0) {
                            count++;
                        }
                    } catch (NumberFormatException e) {
                        return false;

                    }
                    if (!(n >= 0 && n <= 255)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }

        if (count == 4) {
            return false;
        }
        return true;
    }

    public static boolean isValidIP(String str) {
        //String regex="(\\d{1,2}| [1]\\d{2} | [2][0-4][0-9] | [25][0-5]";
        String regex1 = "([1-9]{1,2}|[1]\\d{2}|[2][0-4]\\d|[25][0-5])";
        String regex2 = "(\\d{1,2}|[1]\\d{2}|[2][0-4]\\d|[25][0-5])";
        String pattern = regex1 + "." + regex2 + "." + regex2 + "." + regex2;
        return Pattern.matches(pattern, str);
    }
}
