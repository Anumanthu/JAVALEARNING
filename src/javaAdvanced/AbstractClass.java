package javaAdvanced;

//AbstractClass can contain non-abstarct methods as well

public abstract class AbstractClass 
{
	int a;
	public abstract void login();//abstract method
	
	public void credit() {
		
		System.out.println("Non abstract method credit");
	}
	
    public void debit() {
		
		System.out.println("Non abstract method debit");
	}
	

}
