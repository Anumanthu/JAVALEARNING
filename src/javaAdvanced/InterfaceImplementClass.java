package src.javaAdvanced;

public class InterfaceImplementClass extends SuperClass implements Interface1, Interface2 {

    public static void main(String[] args) {


        //SuperClass sc=new SuperClass();
        //sc.str="JAVA";

        //System.out.println(sc.str);

        InterfaceImplementClass obj1 = new InterfaceImplementClass();

        Interface1 obj2 = obj1;

        Interface2 obj3 = obj1;


        int y = obj2.x;


        System.out.println(y);
        //System.out.println(obj1.x);


        //we can call all the methods with the class
        obj1.add();
        obj1.delete();
        obj1.calc();

        //But we can only call only methods which are present in interface

        obj2.add();
        obj2.delete();


        //obj1.x=20; this is wrong


    }

    public void nonabstract() {
    }

    ;


    //This is normal method

    public void calc() {

    }

    //These are overridden methods
    @Override
    public void add() {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub

    }


    @Override
    public void delete2() {
        // TODO Auto-generated method stub

    }


    //@Override
    //public void add2() {
    // TODO Auto-generated method stub

    //}

}
