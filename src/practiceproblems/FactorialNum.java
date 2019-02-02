package practiceproblems;

public class FactorialNum {

	public static void main(String[] args) {
		
		

		FactorialNum FN=new FactorialNum();
		System.out.println("Factorial number   "+FN.FactorialFinding(3));
		System.out.println("Factorial number   "+FN.FactorialFinding(23));
		

	}

	
	int FactorialFinding(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		
		return n*FactorialFinding(n-1);
		
	}
}
