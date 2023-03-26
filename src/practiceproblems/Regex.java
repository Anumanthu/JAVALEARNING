package src.practiceproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        //**************** Refer javat tutorial.com website for more info...*********************************
        //Refer below link for more info about Java regex
        //https://www.javatpoint.com/java-regex
        //Pattern p=Pattern.compile(".s");//
        //Pattern p=Pattern.compile("[a-c]");
        Pattern p = Pattern.compile("[0-1][0-9]");

        String regx = "19";
        Matcher m = p.matcher(regx);
        System.out.println(m.find());
        System.out.println(m.matches());
        //boolean f=m.find();//finds the next expression that matches the pattern.
        boolean f1 = m.matches();//test whether the regular expression matches the pattern.
        while (m.find()) {
            System.out.println("found");
            System.out.println(m.matches());
        }
        String str = "Naveen automation  labs";

        System.out.println("Remove white spaces  " + str.replaceAll("\\s", ""));

    }

}
