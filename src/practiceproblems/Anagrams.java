package practiceproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrams {

	public int anagrams() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		String str1 = br.readLine();

		String str2 = br.readLine();

		System.out.println("String1--->" + str1);
		System.out.println("String2--->" + str2);

		int count[] = new int[256];
		int i;

		for (i = 0; i < 256; i++) {
			count[i] = 0;
		}

		int n1 = str1.length();
		int n2 = str2.length();

		char c, d;

		if (n1 != n2) {
			System.out.println("Both are not Anagrams");
			return 0;
		}
		for (i = 0; i < n1; i++) {
			c = str1.charAt(i);
			d = str2.charAt(i);
			count[c]++;
			count[d]--;
		}
		for (i = 0; i < n1; i++) {
			c = str1.charAt(i);

			if (count[c] != 0) {

				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		Anagrams obj = new Anagrams();
		int result;

		while (a > 0) {
			result = obj.anagrams();
			if (result == 1) {
				System.out.println("Both are Anagrams");
			}
			a--;
		}

	}

}
