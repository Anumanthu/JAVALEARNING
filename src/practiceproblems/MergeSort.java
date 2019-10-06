package practiceproblems;

public class MergeSort {

	public static void main(String[] args) {

		int A[] = { 2, 4, 1, 6, 8, 5, 3, 7 };
		
		for (int i = 0; i < A.length; i++) {
			System.out.println(" " + A[i]);
		}

		MergeSort(A);

		for (int j = 0; j < A.length; j++) {
			System.out.println(" " + A[j]);
		}
	}

	public static void MergeSort(int A[]) {

		int n = A.length;
		if (n < 2)
			return;
		int m = n / 2;
		int L[] = null, R[] = null;
		for (int i = 0; i <= m; i++) {
			L[i] = A[i];
		}
		for (int j = m + 1; j < n; j++) {
			R[j] = A[j];
		}

		MergeSort(L);
		MergeSort(R);
		Merge(A, L, R);
	}

	public static void Merge(int A[], int L[], int R[]) {
		int nL = L.length, nR = R.length;
		int n = A.length;
		int i = 0, j = 0, k = 0;

		while (i < nL && j < nR) {
			if (L[i] <= R[j]) {
				A[k++] = L[i++];
			} else {
				A[k++] = R[j++];
			}
			while (i < nL) {
				A[k++] = L[i++];
			}
			while (j < nR) {
				A[k++] = R[j++];
			}
		}
	}

}
