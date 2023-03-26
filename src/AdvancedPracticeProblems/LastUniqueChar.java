package src.AdvancedPracticeProblems;

import java.util.HashMap;

public class LastUniqueChar {

    public static void main(String args[]) {

        //Find last unique character from given string

        String str = "Anumanthuhtm";
        // Set<Character> set= new HashSet<>();
        str = str.toUpperCase();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        boolean flag = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (hm.get(str.charAt(i)) == 1) {
                System.out.println("last Unique character " + str.charAt(i));
                flag = true;
                break;
            }

        }
        if (!flag) {
            System.out.println("not found Unique character in the given String");
        }

    }

}
