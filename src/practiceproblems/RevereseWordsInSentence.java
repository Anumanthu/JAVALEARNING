package practiceproblems;

import java.util.StringTokenizer;

public class RevereseWordsInSentence {

	public static void main(String[] args) {

		String s1 = "Welcome to selenium Learning";

		// First reverse the whole string and take one word each time and reverse it

		RecursiveString RS = new RecursiveString();
		System.out.println(s1);
		
		String s=RS.reverse(s1);
		

		int i = 0;

		String str1[] = s.split(" ");

		String str2 = "";

		int c = str1.length;

		for (int k = 0; k < c; k++) {

			//System.out.println(str1[k]);

			str1[k] = RS.reverse(str1[k]);

			//System.out.println(str1[k]);

			str2 = str2.concat(str1[k]) + " ";

		}

		System.out.println(str2);

	}

}
