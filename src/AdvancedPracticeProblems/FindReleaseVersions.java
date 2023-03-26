package src.AdvancedPracticeProblems;


public class FindReleaseVersions {

    public static void main(String args[]) {
        // 3.1.1, 3.1.2,3,3.0,3.0.0,3.0.5
        //input  3.0
        String versions[] = {"3.1.1", "3.1.2", "3", "3.0", "3.0.0", "3.0.5"};
        String input = "3.0.0";
        int requiredLen = 3;
        //"300"
        input = input.replace(".", "");
        int len = input.length();

        int addZeros = requiredLen - len;

        while (addZeros > 0) {
            input = input + "0";
            addZeros--;
        }
        boolean flag = false;
        for (int i = 0; i < versions.length; i++) {
            //"310"
            versions[i] = versions[i].replace(".", "");
            //String splitting[]=versions[i].split(".");
            //System.out.println("after splitting "+splitting);
            if (versions[i].length() < requiredLen) {
                addZeros = requiredLen - versions[i].length();
                while (addZeros > 0) {
                    versions[i] = versions[i] + "0";
                    addZeros--;
                }
            }

            if (Integer.parseInt(versions[i]) > Integer.parseInt(input)) {
                if (!flag) {
                    System.out.println("Higher release are ");
                    flag = true;
                }

                System.out.print(" " + versions[i].charAt(0) + "." + versions[i].charAt(1) + "." + versions[i].charAt(2));
            }
        }
        if (!flag) {
            System.out.println(" No Higher release found ");
        }
    }
}
