package src.javaAdvanced;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HasSetexample {

    public static void main(String[] args) {

        // HasSet TreeSet LinkedHashset inplements set interface

        // HashSet does not maintain sequential order
        // LinkedHashSet maintains inserting order
        // TreeSet maintains elements in ascending or descending order but default is
        // ascending order

        // does not accept duplicate values
        // There is no guarantee elements stored in sequential order.

        HashSet<String> hs = new HashSet<String>();

        hs.add("USA");
        hs.add("INDIA");
        hs.add("UK");
        hs.add("INDIA");
        hs.add("he");
        hs.add("she");
        System.out.println(hs);// 1st way to print Set elements
        System.out.println(hs.isEmpty());

        System.out.println(hs.contains("INDIA"));

        System.out.println(hs.contains("Anumanthu"));


        System.out.println(hs.size());

        Iterator<String> i = hs.iterator();

        while (i.hasNext()) {
            i.next();
            // System.out.println(i.next());//2nd way to print or get elements
        }

        for (String ele : hs) {
            // System.out.println(ele);//3rd way to print or get elements

        }

        // Converting Set into List (VERY VERY IMPORTANT)

        ArrayList<String> al = new ArrayList<String>(hs);

        System.out.println(al.get(3));

    }

}
