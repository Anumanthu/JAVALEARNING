package javaAdvanced;

//AbstractClass can contain non-abstarct methods as well

public abstract class AbstractClass {
    int a;

    public abstract void login();//abstract method

    //***Imp point we can define abstract class without abstract methods also..it is not Mandatory to have atleat one abstract method
    //public abstract class AbstractClass {It can have only non-abstract methods};

    //below are non abstrat methods

    public void credit() {

        System.out.println("Non abstract method credit");
    }

    public void debit() {

        System.out.println("Non abstract method debit");
    }


}
