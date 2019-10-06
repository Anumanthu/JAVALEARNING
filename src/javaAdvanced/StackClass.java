package javaAdvanced;

import java.util.*;

public class StackClass {

	public static void main(String[] args) {
		
		Stack<Integer> s= new Stack<Integer>();
		
		//s.push("BCD");
		s.push(50);
		s.push(23);
		//s.push("Divya");
		
		s.push(10);
		s.push(18);
		
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.size());
	
		s.push(24);
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.size());
		
		
		
		

	}

}
