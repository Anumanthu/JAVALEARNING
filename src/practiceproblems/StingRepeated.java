package practiceproblems;

import java.util.HashMap;
import java.util.HashSet;

public class StingRepeated {

	String a = "25";
	int b = Integer.parseInt(a);

	String c = Integer.toString(b);

	String d = String.valueOf(b);
	
	

	public void hashSet(StringBuffer str) {
		HashSet<Character> hs = new HashSet<Character>();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (hs.contains((str.charAt(i)))) {
				if (hm.containsKey(str.charAt(i))) {

					hm.put(str.charAt(i), count + 1);
				} else {
					hm.put(str.charAt(i), count);
				}

			} else
				hs.add(str.charAt(i));
		}

	}

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("ANUMANTHUA");
		
		String str2=null;
		//Changing StringBuffer to String(Mutable to Immutable)
		str2=str.toString();

		// int n=str.length();

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					// System.out.println("This character is repeated "+str.charAt(j));
					count++;

					str.deleteCharAt(j);
				}
			}
			if (count > 1)
				System.out.println("This character " + str.charAt(i) + " is repeated   " + count + " times");

			else
				System.out.println("This character " + str.charAt(i) + " is repeated only   " + count + " time");

		}

	}

}
