package practiceproblems;

public class FindStringContainDigits {

    public static void main(String[] args) {

        System.out.println(isStringContainsDigits("anu123manthu123"));
        System.out.println(isStringContainsDigits("anumanthu123"));
        System.out.println(isStringContainsDigits("anumanthu"));
        System.out.println(isStringContainsDigits("anum43254anthu"));

    }

    public static boolean isStringContainsDigits(String str) {

        boolean flag = true;
        char ch;

        if ((str.length() == 0) || str.isEmpty())
            flag = false;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            flag = Character.isDigit(ch);
            if (flag)
                break;

        }
        return flag;

    }

}
