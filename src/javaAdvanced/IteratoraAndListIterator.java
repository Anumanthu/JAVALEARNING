package javaAdvanced;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratoraAndListIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(45);
		al.add(20);
		al.add(10);
		al.add(12);
		al.add(18);
		
		Iterator<Integer> i= al.iterator();  //It allows to iterate in one direction only(Forward)
		
		
	 System.out.println(al.size());
	 
		System.out.println(" ");
		
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
		
		
		
		ListIterator<Integer> li=al.listIterator();//It allows to iterate in both directions(Forward&Backward)
		
		System.out.println(" ");
		while(li.hasNext())  //Forward direction
		{
			System.out.print(li.next()+" ");
		}
		
		System.out.println(" ");
		
		while(li.hasPrevious())   //Backward direction
		{
			System.out.print(li.previous()+" ");
		}
		
		
		

			
			
	}

}
