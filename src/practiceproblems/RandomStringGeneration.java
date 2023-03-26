package src.practiceproblems;

public class RandomStringGeneration {

    public static void main(String[] args) {
        String str = "Anumanthu_";
        String randomStringGeneated = str + randomString(5);
        System.out.println(" Random String generated is --->" + randomStringGeneated);
    }

    public static String randomString(int length) {
        String AlphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        int n = AlphaNumeric.length();
        String randomStringGen = "";
        try {
            for (int i = 0; i < length; i++) {
                int r = (int) (n * Math.random());
                // System.out.println(" Random number generated is --->"+r);
                randomStringGen = randomStringGen + AlphaNumeric.charAt(r);
            }
        } catch (Exception e) {

            System.out.println("Exception caught Something went wrong--->" + e);

        }
        return randomStringGen.toString();
    }

}
