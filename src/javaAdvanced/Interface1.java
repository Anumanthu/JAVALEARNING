package javaAdvanced;

public interface Interface1 {
	
	int x=10; //By default datatype is public static final
	void add();//By default signature is public abstract void add();
	public abstract void delete();
	
	void delete2();
	
	//This method ever used and never called since we can't create object for interface 
	//but we can assign any other to interface
	private void add2()
	{
		
	}

}
