package src.hackerrank;

public class SuperString {
    public static int i = 1;
    public static int A[] = {2, 4, 9, 6, 8, 5, 3, 7, 1};

    public static void main(String args[]) {

//		String str = "Learning  new technoligies never stop learning";
//		String split[] = str.split(" ");// it can handle single white space only
//		// String split[]=str.split("\\s+");//it can handle two or more whit spaces also
//		for (String str2 : split) {
//			System.out.println(str2);
//		}
//		String[] strarray = { "Red", "Blue", "Violet", "Green", "Yellow", "Black", "White" };
//
//		ArrayList<String> al1 = new ArrayList<>(Arrays.asList(strarray));
//		ArrayList<String> al2 = new ArrayList<>(
//				Arrays.asList("Red", "Blue", "Violet", "Green", "Yellow", "Black", "White"));
//
//		System.out.println(Character.isDigit('0'));
//		System.out.println(Character.isDigit('c'));
//		System.out.println(al1);
//		System.out.println(al2);

        String str = "hereiamstackerrank";
        StringBuffer str1 = new StringBuffer("hereiamstackerrank");

        System.out.print(hackerrankInString(str));

    }

    public static String hackerrankInString(String s) {

        String str = "hackerrank";

        StringBuffer str1 = new StringBuffer(s);
        int k = 0;
        for (int i = 0; i < str.length() && i < str1.length(); i++) {
            if (str.charAt(i) != str1.charAt(i)) {
                while (i < str1.length() && str.charAt(i) != str1.charAt(i)) {
                    str1.deleteCharAt(i);
                    //k++;
                }
            }
        }
        if (!str.equalsIgnoreCase(str1.toString().substring(0, str.length()))) {
            return "NO";
        }

        return "YES";
        // Write your code here

    }
}
