package practiceproblems;

public class SwappingWithoutUsing3Variable {

	public static void main(String[] args) {
		//Using bitwise operators
		
		int a=23;
		int b=78;
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swapping "+a+" "+b);  
		
		
		//Using + operator
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping "+a+" "+b);  
        

	}

}
