package javaAdvanced;

public interface Interface1 {
	
	int x=10; //By default datatype is "public static final"
	void add();//By default signature is "public abstract" void add();
	public abstract void delete();
	
	void delete2();
	
	//We can't define non-abstract methods in the interface 
	//but we can define non-abstract methods with default access specifier as shown below 
	
	default void nonabstract() {};
	
	//This method ever used and never called since we can't create object for interface 
	//but we can assign any other to interface
	//private void add2()
	//{
		
	//}

}
