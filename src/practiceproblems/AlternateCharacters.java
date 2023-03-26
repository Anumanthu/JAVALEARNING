package src.practiceproblems;

public class AlternateCharacters {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //In this case it 4 to AB delete AA and BB
        String s = "AAABBB";//Count no of deletions required to make adjacent character is not same
        int counter = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                counter++;
            }

        }

        System.out.println("Counter is " + counter);
    }

}
