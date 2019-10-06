package javaAdvanced;

public class ExceptionsExample {

	public static void main(String[] args) {

		ExceptionsExample obj = new ExceptionsExample();
		int a = obj.exceptionHandler();
		System.out.println(a);

	}

	public int exceptionHandler() {
		int c;
		int a = 0, b = 27;

		try {

			c = b / a;

			// System.out.println(c);

			return c;

		} catch (Exception e) {

			System.out.println("Caught an exception" + e);
		}

		finally {
			System.out.println("This is 100% executable code irrespective of try/catch block");
		}
		return 0;

	}

}
