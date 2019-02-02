package practiceproblems;

public class OutOfMemoryException {

	public static void main(String[] args) {
		
		//This is Very Very Important Interview question
		String x=null;
		int y=0;
		
		
		while(true)
		{
			x=x+x;
		}
		
		/* while(true)
		{
		System.out.println("This will execute infinite times without giving EXCEPTION OutOfMemoryException");
		}
		
		*/
		
		
//You will receive java.lang.OutOfMemoryError Exception
		
		
	}

}
