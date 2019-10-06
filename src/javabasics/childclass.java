package javabasics;

class Base1 {

	public static void same()
	{
		System.out.println("This is from Base1");
	}
	
	static {
		System.out.println("This is static block from base1 class");
		
		same();
	}
	
			
}

class Base2 {

	public static void same()
	{
		System.out.println("This is from Base2");
	}
	
	static {
		System.out.println("This is static block from base2 class");
		
		same();
	}
	
			
}

class Base3 {//Class can't be declare as private like private class Base3{};

	public static void same2()
	{
		System.out.println("This is from Base3");
	}
	
	
			
}

class childclass extends Base1{
	
	static {
		System.out.println("This is static block from child class");
	}

	public static void same()
	{
		System.out.println("This is from child");
	}
	
	childclass()
	{
		super.same();
	}
	
	public static void main(String args[])
	{
		childclass	child=new childclass();
		
		
		
		
		//int a=Integer.parseInt("str");
		
		//System.out.println("The value of  "+a);// It will throw an java.lang.NumberFormatException: 
		
		//main(2);  //We can overrload main main this way
		//main('c');
	}
	
	public static void main(int a)
	{
		System.out.println("This is another main "+a);
	}
	
	public static void main(char a)
	{
		System.out.println("This is another2 main "+a);
	}
	
}



