package javaAdvanced;

public class SuperClass {
	
	String str="ANUMANTHU";
	
	//str="Naveen";
	
	String str2="Divya";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="Anumanthu";
		
		s1="Nandini";
		
		SuperClass sc=new SuperClass();
		
		sc.str=sc.str2;
		sc.str2="Nandini";
		
		System.out.println(sc.str);
		System.out.println(sc.str2);
	}

	

	
}
