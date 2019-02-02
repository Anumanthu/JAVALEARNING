package javabasics;

public class BaseClass {

	String str;

	final public void add() {

	}

	static {
		System.out.println("This static block---this can execute before main method");
	}

	final public static int G = (int) 9.8;

	public static void main(String args[]) {
		System.out.println("This main block");

		System.out.println(G);

		// G=10; GIVES ERROR since it is final(constatnt)

		FinalClass fl = new FinalClass();
		fl.a = 10;

	}

}

final class FinalClass // Final class can't be extended in any other class
{
	public int a;
}
