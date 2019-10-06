package javaAdvanced;

import java.util.*;

public class ArrayListexample {

	public static void main(String[] args) {
		
		
		//ArrayList,LinkedList,Vector implements List Interface
		
		//array has fixed size where as ArrayList can grow or shrink dynamically
		
		
		
		ArrayList<String> a = new ArrayList<String>();
		
		
		a.add("JAVA");
		a.add("Selenium");
		a.add("Selenium");
		//System.out.println(a);
		
		
		a.add(1, "Divya");
		System.out.println(a);
		
		a.remove(1);
		a.remove(a.indexOf("JAVA"));
		//a.remove(a.get(1));
		
		//System.out.println(a);
		
		System.out.println(a.get(1));
		
		System.out.println(a.contains("DIVYA"));
		
		System.out.println(a.contains("Divya"));
		
		System.out.println(a.indexOf("Divya"));
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
		//ArrayList implements List Interface which accepts duplicate values
		
		a.add(1, "Divya");  //we have already Divya at index 1 which will move further
		
		//a.remove(arg0)
		
		//ArrayList<Character> al=new ArrayList<Character>();
		//ArrayList<Integer> al=new ArrayList<Chara>();
		
		System.out.println(a);
		System.out.println(a.size());
		
		//a.add(7,"Anumanthu");//You will get exception
		
		//System.out.println(a);
		//System.out.println(a.size());
		
		//a.contains("Java");//It will check Java string present or not in ArrayList
			
	}

}
