package src.practiceproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CollectionsFramework {

	public static void main(String args[]) {

		List<String> lst = new ArrayList<String>();
		lst.add("abc");
		lst.add(null);
		lst.add(null);
		lst.add(null);

		System.out.println(lst.toString());
		Stack<Object> s = new Stack<>();

		String str = "name";

		char[] ch1 = { '2', '3', '4' };
		char[] ch2 = Arrays.copyOf(ch1, 4);

		for (char ch : ch2) {
			System.out.println("new Array " + ch);
		}

		//it will return index of mismatch element between two arrays
		System.out.println("return index of miss match element "+Arrays.mismatch(ch1, ch2));
	}

}
