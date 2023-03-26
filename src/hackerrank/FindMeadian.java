package src.hackerrank;

public class FindMeadian {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] ar1 = {-5, 3, 6, 12, 15};
        int[] ar2 = {-12, -10, -6, -3, 4, 10};

//		int ar1[]={2, 3, 5, 8};
//        int ar2[] = {10, 12, 14, 16, 18, 20};

        System.out.println(findMedain(ar1, ar2));

    }

    public static int findMedain(int[] a, int[] b) {
        // Assume that both arrays are sorted

        int index = (a.length + b.length) / 2 + 1;
        boolean flag = false;
        if ((a.length + b.length) % 2 == 0) {
            flag = true;
        }
        int m[] = new int[index];
        int k = 0;
        int i = 0, j = 0;
        for (; i < a.length && j < b.length && k < index; ) {
            if (a[i] < b[j]) {
                m[k++] = a[i++];
            } else {
                m[k++] = b[j++];
            }
        }
        while (k < index && i < a.length) {
            m[k++] = a[i++];
        }
        while (k < index && j < b.length) {
            m[k++] = b[j++];
        }
        if (flag) {
            return (m[k - 2] + m[k - 1]) / 2;
        }
        return m[k - 1];

    }

}
