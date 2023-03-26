package src.practiceproblems;

import java.util.regex.Pattern;

public class StrongPassword {


    public static void main(String[] args) {
        //String str="2bb#A";
        //String str = "2bbbb";
        String str = "AUzs-nV";

        System.out.println("Minimum characters need to be added " + minimumNumber(5, str));
    }

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        int minimum = 0;

        String regex1 = "[0-9]{1,}";
        String regex2 = "[a-z]{1,}";
        String regex3 = "[A-Z]{1,}";
        String regex4 = "([!@#$%^&*()+]{1,}|-{1,})"; //Added hyphen separately since it will denote as [a-z] like a to z any character

        if (!Pattern.compile(regex1).matcher(password).find()) {
            minimum = minimum + 1;
        }

        if (!Pattern.compile(regex2).matcher(password).find()) {
            minimum = minimum + 1;
        }

        if (!Pattern.compile(regex3).matcher(password).find()) {
            minimum = minimum + 1;
        }

        if (!Pattern.compile(regex4).matcher(password).find()) {
            minimum = minimum + 1;
        }

        if (n + minimum >= 6) {
            return minimum;
        } else {
            return 6 - n + minimum;
        }

        //6-3-2=1;

        // return minimum;


    }
}
