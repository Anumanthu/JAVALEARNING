package src.javaAdvanced;

import java.util.ArrayList;

public class GenericClass {

    ArrayList<String> al = new ArrayList<String>();//Defining type of object Mandatory form 1.5 version..

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        print(2, 3);
        print("abc", "def");
    }

    public static <T> void print(T t1, T t2) {

        System.out.println("passing values are --->" + t1 + " and " + t2);
    }
    //so Generics are used for type safety and object notification

}
