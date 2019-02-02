package javaAdvanced;

public class StringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1=new String("Anumathu");
		
		String str="Welcome to Selenium Learning";
		
		System.out.println(str1);
		
		System.out.println(str.indexOf("hello"));//This is very imp whenever we want to check any string is present in another string
		
		System.out.println(str.length());
		System.out.println(str.endsWith("s"));
		System.out.println(str.endsWith("g"));
		
		System.out.println(str.startsWith("Welcome"));
		
	
		//Check given string is palindrome or not
		
		String Str2="MADAM";
		
		int l=0,h=Str2.length()-1;
		
		while(h>l)
		{
		if(Str2.charAt(l)!=Str2.charAt(h))
		{
			System.out.println("Given string  "+Str2+"  is not Palindrome");
			break;
		}
		
		l++;
		h--;
		
		if(h==l)
		System.out.println("Given string  "+Str2+"  is Palindrome");
	}

		
		
		
		
		

	}

}



