package javaAdvanced;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		
		//Scanner s=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		
		
		//System.out.println("Enter any Number :");
		
		//int x =s.nextInt();
		
		String str=s.nextLine();
		
		//System.out.println(x+2);
		
		Singletonclass y=Singletonclass.getInstance();
		System.out.println(y.str);
		
		Singletonclass z=Singletonclass.getInstance();
		
	y.str=(y.str).toUpperCase();
	
	System.out.println(z.str);
		
		
		
		

	}

}
