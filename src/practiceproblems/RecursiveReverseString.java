package practiceproblems;

public class RecursiveReverseString {

	public static void main(String[] args) {

		RecursiveReverseString obj = new RecursiveReverseString();

		StringBuffer orig = new StringBuffer("ANUMANTHU");

		StringBuffer reverse = new StringBuffer("");
		System.out.println("Original String " + orig);

		obj.recursive(orig, reverse);

		System.out.println("Reverse  String " + reverse);

	}

	public void recursive(StringBuffer orig, StringBuffer reverse) {

		if (orig.length() > 0) {
			reverse = reverse.append(orig.charAt(orig.length() - 1));
			orig.deleteCharAt(orig.length() - 1);
			recursive(orig, reverse);
		}

	}

}
