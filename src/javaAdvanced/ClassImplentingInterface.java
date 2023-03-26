package src.javaAdvanced;

interface iface1 {

    int a1 = 2;

    void iface11();

    void iface12();
}

interface iface2 {
    int a2 = 2;// we can't define other scope/access specifiers(public static final)
    //private int a3=3;//compile time error

    // below is valid
    public static void iface23() {
    }

    void iface21();// default -->public abstract

    void iface22();

}

public class ClassImplentingInterface {

    public static void main(String[] args) {

        // This class not fully implemented work on it in your free time
        iface1 iface1obj = new A();
        iface1obj.iface11();// accessible to iface11,iface12

        iface2 iface1obj2 = new A();
        iface1obj2.iface21();// accessible to iface21,iface22

        A a = new A();
        a.iface22();// accessible to all methods

        B b = (B) new A();
        // b
    }

}

class A implements iface1, iface2 {

    int A1 = 10;

    public void noramlmehtodA() {

    }

    @Override
    public void iface21() {

    }

    @Override
    public void iface22() {

    }

    @Override
    public void iface11() {

    }

    @Override
    public void iface12() {

    }

}

class B extends A {
    int B1 = 10;
    private int B2 = 23;

    public void noramlmehtodB() {

    }

}

class C extends B {
    int B1 = 10;
    private int B2 = 23;

    public void noramlmehtodC() {

    }

}

abstract class D implements iface1 {

    public void iface11() {
        System.out.println("overriden");
    }

    public void noramlmehtodC() {

    }

}
