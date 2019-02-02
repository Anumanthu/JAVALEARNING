package javaAdvanced;

public class ExceptionsExample {

	public static void main(String[] args) {
	
		ExceptionsExample obj=new ExceptionsExample();
		int a=obj.exceptionHandler();
		System.out.println(a);
		
		
		
	}

	public int exceptionHandler()
	{
		int c;
		int a=3,b=27;
		
		try
		{
		
			
		
			
			c=b/a;
			
			System.out.println(c);
			
			return c;
			
			
			
			
		}catch(Exception e)
		{
		}
		
       finally
       {
    	   System.out.println("This is 100% executable code irrespective try/catch block");
       }
		return 0;
		
	}
	
	
}
