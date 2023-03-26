package practiceproblems;

public class ReversingString {

    public static void main(String[] args) {

        String str = "ANUMANTHU";


        String reverse = "";

        int n = str.length() - 1;

        while (n >= 0) {
            reverse = reverse + str.charAt(n);
            n--;
        }

        System.out.println("The reverse of a string  " + str + "--is ----->" + reverse);


    }

}
