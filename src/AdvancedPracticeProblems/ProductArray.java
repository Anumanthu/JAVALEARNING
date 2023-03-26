package src.AdvancedPracticeProblems;

public class ProductArray {

    public static void main(String args[]) {
        //int input[] = {2, 3, 5, 7}; // output-> 105,70,42,30;

        //int input[] = {2, 3, 5, 7,0}; // output 0 0 0 0 210

        int input[] = {2, 3, 0, 5, 7, 0}; // output 0 0 0 0 0 0
        // logic output for input = x1=x1*x2*x3*x4/x1=105;
        int multiplyAll = 1;
        int noOfZeros = 0;
        boolean flag = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                flag = true;
                noOfZeros++;
            } else {
                multiplyAll = multiplyAll * input[i];
            }
        }
        //for new line
        System.out.println();
        for (int i = 0; i < input.length; i++) {
            if (noOfZeros == 0) {
                System.out.print(" " + multiplyAll / input[i]);
            } else if (noOfZeros == 1 && input[i] == 0) {
                System.out.print(" " + multiplyAll);
            } else {
                System.out.print(" 0");
            }
        }
    }
}
