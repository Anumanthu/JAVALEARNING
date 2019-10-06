package javabasics;

public class NonStaicAndSatic {

	public static void main(String[] args) {
		
		int z;
		
		

	}

}

interface Iface1
{
	int i1=9;
	void iface1method1(int a);
	int iface1method2();
}
interface Iface2
{
	int i2=10;
	void iface2method1();
	int iface2method2();
}

class A 
{
	private int n2;
	int n1;
	static int s1;

	void nonstaticmehtod()
	{
		n1=10;
		s1=20;
		n2=30;
	}
	
	static void staticmehtod()
	{
		A a=new A();
		a.n1=20;
		s1=30;//or a.s1=30; or A.s1=30; since this is static
		a.n2=30;
	}
	
	
}


class C extends A implements Iface1,Iface2
{

	
	public void f1()
	{
		int n2;
	}
	@Override
	public void iface2method1() {
		// TODO Auto-generated method stub
		
		int n3;
		System.out.println(i1);
		System.out.println(i2);
		//i1=9;//compilation error
		//i2=9;//compilation error
	}

	@Override
	public int iface2method2() {
		// TODO Auto-generated method stub
		
		System.out.println(i1);
		System.out.println(i2);
		//i1=11;//compilation error
		//i2=12;//compilation error
		
		return 0;
	}

	@Override
	public void iface1method1(int a) {
		// TODO Auto-generated method stub
		System.out.println(i1);
		System.out.println(i2);
		
		//i1=11;//compilation error
		//i2=12;//compilation error
	}

	@Override
	public int iface1method2() {
		// TODO Auto-generated method stub
		
		System.out.println(i1);
		System.out.println(i2);
		//i1=9;//compilation error
		//i2=9;//compilation error
		
		return 0;
	}
	
}
abstract class D
{
	int z;
	public static final int z1=9;
	abstract void f2();
	 void f3()
	 {
	 }

	
}


class B extends D
{
	
	void nonstaticmehtod1()
	{
		A a=new A();
		a.n1=10;
		A.s1=20;
		a.s1=40;
		//a.n2=40;//compilation error n2 is private data memeber
		
		
	}
	
	static void staticmehtod1()
	{
		A a=new A();
		a.n1=20;
		A.s1=30;
		a.s1=40;
		//a.n2=40;//compilation error n2 is private data memeber
		
		//A.n2=40;//compilation error n2 is private data memeber
	}

	@Override
	void f2() {
		// TODO Auto-generated method stub
		
	}
	
}



