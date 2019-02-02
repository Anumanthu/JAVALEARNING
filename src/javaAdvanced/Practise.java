package javaAdvanced;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practise {
	
	



	public static void main(String[] args) {
		
		
	     
        Scanner sc=new Scanner(System.in);
        
        String actual=sc.nextLine();
        StringTokenizer tk1=new StringTokenizer(actual);
        
        //int count=tk1.countTokens();
        
        int dd1=Integer.parseInt(tk1.nextToken().toString());
        int mm1=Integer.parseInt(tk1.nextToken().toString());
        int yy1=Integer.parseInt(tk1.nextToken().toString());
    

        String expected=sc.nextLine();
        
StringTokenizer tk2=new StringTokenizer(expected);
        
        //int count=tk1.countTokens();
        
        int dd2=Integer.parseInt(tk2.nextToken().toString());
        int mm2=Integer.parseInt(tk2.nextToken().toString());
        int yy2=Integer.parseInt(tk2.nextToken().toString());
      
        if(dd1<=dd2 && ((mm1-mm2)<=0) && ((yy1-yy2)<=0))
        System.out.println(0);
        else if(dd1>dd2 && (mm1==mm2) && (yy1==yy2))
            System.out.println(15*(dd1-dd2));
        else if(mm1>mm2 && (yy1==yy2))
            System.out.println(500*(mm1-mm2));
        else if(yy1>yy2)
            System.out.println(10000);
        else
        	System.out.println(0); 
    
        

        	}

}
