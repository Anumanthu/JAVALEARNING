package practiceproblems;

public class PrintMaxMatrix {


    public static void main(String[] args) {


        int[][] Arr = {{2, 3, 4}, {9, 0, 3}, {8, 7, 1}};

        int Max = findMax(Arr);

        System.out.println("Max number is  " + Max);


    }


    public static int findMax(int Arr[][]) {
        int row = 3, coln = 3, min = Arr[0][0], reqcoln = 0, Max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < coln; j++) {
                if (min >= Arr[i][j]) {
                    min = Arr[i][j];
                    reqcoln = j;
                    Max = Arr[i][j];
                }
            }
        }

        for (int i = 0; i < row; i++) {
            if (Max <= Arr[i][reqcoln]) {
                Max = Arr[i][reqcoln];
            }

        }
        return Max;


    }
}
