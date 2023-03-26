package javabasics;

public class StaticVariable {

    public static int a;
    public int b = 10;
    public int c = 12;
    public String str = "Anumanthu";


    public static void main(String[] args) {

        StaticVariable obj;

        //System.out.println("a values are "+obj.a);
        //System.out.println("b values are "+obj.b);  //For all thes gives compilation error since object is not intialized
        //System.out.println("c values are "+obj.c);
        //System.out.println("str values are "+obj.str);


        obj = new StaticVariable();
        obj.a = 10;
        obj.b = 20;

        StaticVariable obj1 = new StaticVariable();

        System.out.println("a values are " + obj.a);//prints 10
        System.out.println("a values are " + obj1.a);//prints 10
        System.out.println("b values are " + obj.b);//prints 20
        System.out.println("b values are " + obj1.b);////prints 10 since non static data member

        obj1.a = 30;
        obj1.b = 40;


        System.out.println("a values are " + obj.a);//prints 30
        System.out.println("a values are " + obj1.a);//prints 30
        System.out.println("b values are " + obj.b);//prints 20 since it is non static
        System.out.println("b values are " + obj1.b);//prints 40 since obj1.b=40


    }

}
