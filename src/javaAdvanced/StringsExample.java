package src.javaAdvanced;

public class StringsExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str1 = new String("Anumathu");
        String str2 = new String("Anumanthu");

        String str3 = str1.valueOf(2);

        String str = "   Welcome to Selenium Learning";


        int a[] = {2, 3, 4, 5};
        int lenght = a.length;

        // str="Anumanthu stirng";

        System.out.println(str1);
        System.out.println(str1.trim());

        String args1 = str.split(" ")[3];
        System.out.println(args1);

        System.out.println(str.indexOf("hello"));// This is very imp whenever we want to check any string is present in
        // another string

        System.out.println(str.length());
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("g"));

        System.out.println(str.startsWith("Welcome"));

        // Check given string is palindrome or not

        String Str2 = "MADAM";

        int l = 0, h = Str2.length() - 1;

        while (h > l) {
            if (Str2.charAt(l) != Str2.charAt(h)) {
                System.out.println("Given string  " + Str2 + "  is not Palindrome");
                break;
            }

            l++;
            h--;

            if (h == l)
                System.out.println("Given string  " + Str2 + "  is Palindrome");
        }
    }
}
