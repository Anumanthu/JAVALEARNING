package src.practiceproblems;


/*Example
 * s='lmnop'

The ordinal values of the charcters are [108,109,110,111,112].S rverse='ponml'  and the ordinals are [112,111,110,109,108].
 The absolute differences of the adjacent elements for both strings are [1,1,1,1], so the answer is Funny.

Function Description

Complete the funnyString function in the editor below.

funnyString has the following parameter(s):

string s: a string to test
Returns

string: either Funny or Not Funny */

public class FunnyStringFinding {
    public static int i = 1;
    public static int A[] = {2, 4, 9, 6, 8, 5, 3, 7, 1};

    public static void main(String args[]) {

        String s = "acxz";
        System.out.println("Given string is " + funnyString(s));

    }

    public static String funnyString(String s) {

        char[] s1 = new char[s.length()];
        char[] s2 = new char[s.length()];

        StringBuffer reverse = new StringBuffer(s);
        reverse.reverse();


        for (int i = 0; i < s.length(); i++) {
            s1[i] = s.charAt(i);
            s2[i] = reverse.charAt(i);
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s1[i] - s1[i + 1]) != Math.abs(s2[i] - s2[i + 1])) {
                return "Not Funny";
            }
        }
        return "Funny";

    }
}
