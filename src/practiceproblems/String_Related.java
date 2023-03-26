package src.practiceproblems;

public class String_Related {

    public static void main(String[] args) {

        //input
        String str = "This is my string";
        String str1 = str.replace(" ", "");

        String str2 = "";

        System.out.println(str1);
        for (int i = 0; i < str1.length(); i++) {
            if (i % 3 == 0 && i != 0)
                str2 = str2 + " " + str1.charAt(i);
            else
                str2 = str2 + str1.charAt(i);

        }
        System.out.println(str2.trim());//output: Thi sis mys tri ng every third letter there should be one space
    }

}
