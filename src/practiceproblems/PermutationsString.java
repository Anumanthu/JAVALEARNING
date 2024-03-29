package src.practiceproblems;

public class PermutationsString {
    public static void main(String[] args) {
//
//        Input: str = “abb”
//        Output: abb bab bba
//
//        Input: str = “geek”
//        Output: geek geke gkee egek egke eegk eekg ekge ekeg kgee kege keeg
        //String str = "ABCDE";
        String str = "geek";
        int n = str.length();
        PermutationsString permutation = new PermutationsString();
        //permutation.permute(str, 0, n - 1);

        computePermutations(str, "");
    }

    public static void computePermutations(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans + " ");
            return;
        }


        for (int i = 0; i < str.length(); i++) {
            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            computePermutations(ros, ans + ch);
        }
    }

    /**
     * permutation function
     *
     * @param str string to calculate permutation for
     * @param l   starting index
     * @param r   end index
     */
    private void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    /**
     * Swap Characters at position
     *
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
