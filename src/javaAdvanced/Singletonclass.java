package javaAdvanced;

public class Singletonclass {
	
	//NOTE:See the Scanner class how Singletonclass object is invoked
	
	//In OOPS, Singleton class is a class that can have only one object(instance of the class) at a time
	//1.Make constructor as private
	//2.public static method (getInstance) that has return type of object of this singleton class(This is also called Lazy Initialization)
	
	private static Singletonclass singletonobject=null;
	
	public String str,str2="LEARNING";
	
	private Singletonclass()
	{
		str="I'm learning Java Basics";
		
	}
	
	public static Singletonclass getInstance()
	{
		if(singletonobject==null)
		singletonobject=new Singletonclass();
		
		return singletonobject;
	}

	public static void main(String[] args) {
		
		Singletonclass x=Singletonclass.getInstance();
		Singletonclass y=Singletonclass.getInstance();
		Singletonclass z=Singletonclass.getInstance();
		
		Singletonclass k=new Singletonclass();
		
		Singletonclass w=new Singletonclass();
		
		
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		System.out.println(k.str);
		//System.out.println(w.str);
		
		//z.str=(z.str).toLowerCase();
		
		System.out.println("------------------------------------------");
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		System.out.println(k.str2);
		//System.out.println(w.str);

	}

}
