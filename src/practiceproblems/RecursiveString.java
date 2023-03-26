package src.practiceproblems;

public class RecursiveString {


    public static void main(String[] args) {
        RecursiveString obj = new RecursiveString();
        String str = "Quora";
        System.out.println("Reverse of \'" + str + "\' is \'" + obj.reverse(str) + "\'");
    }

    public String reverse(String str) {
        if ((str == null) || (str.length() <= 1))
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
