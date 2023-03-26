package src.practiceproblems;

public class HalfTraingle_Format {

    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int length = 6;
        printingHalfTriangle(str, length);

    }

    public static void printingHalfTriangle(String str, int length) {

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }

    }

}
