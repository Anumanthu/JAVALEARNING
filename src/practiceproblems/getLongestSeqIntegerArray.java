package src.practiceproblems;

public class getLongestSeqIntegerArray {

    public static void main(String[] args) {

//        Input : arr[] = {1, 2, -3, 2, 3, 4, -6, 1,
//            2, 3, 4, 5, -8, 5, 6}
//        Output :Index : 7, length : 5
//        output=1,2,3,4,5
//
//        Input : arr[] = {-3, -6, -1, -2, -3, -8}
//        Output : No positive sequence detected.
        //int arr[] = {1, 2, -3, 2, 3, 4, -6, 1, 2, 3, 4, 5, -8, 5, 6};
        int arr[] = {-3, -6, -1, -2, -3, -8};


        findLongestIntgerArray(arr);

    }

    public static void findLongestIntgerArray(int[] a) {
        int startIndex = 0;
        int currentStartIndex = 0;
        int currentEndIndex = 0;
        int logestLeng = 0;
        for (int i = 0; i < a.length - 1; i++) {
            currentStartIndex = i;
            currentEndIndex = i;

            while (i < a.length - 1 && a[i] == a[i + 1] - 1) {
                i++;
                currentEndIndex = i;
            }

            if (logestLeng < currentEndIndex - currentStartIndex) {
                startIndex = currentStartIndex;
                logestLeng = currentEndIndex - currentStartIndex + 1;
            }
        }
        System.out.println("Start Index " + startIndex);
        System.out.println("Length " + logestLeng);
    }

}
