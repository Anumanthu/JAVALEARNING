package src.practiceproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;

/*Java Comparator interface is used to order the objects of a user-defined class.

This interface is found in java.util package and contains 2 methods 
compare(Object obj1,Object obj2) and equals(Object element).

It provides multiple sorting sequences, i.e., you can sort the elements on the basis of 
any data member, for example, rollno, name, age or anything else

*/

public class ComparatorInterface {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Student> al = new ArrayList<Student>();

        Student s = new Student(12, "Neha", 5);

        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));
        al.add(new Student(98, "Neha", 5));
        al.add(new Student(202, "Anumanthu", 31));
        al.add(new Student(12, "Nandu", 25));

        System.out.println("********************1st WAY OF Sorting***************************************************");
        System.out.println("Sorting by name -->");
        System.out.println();
        //Stream st1=al.stream().sorted(new NameComparator().reversed());//descending order
        Stream st1 = al.stream().sorted(new NameComparator());//Ascending order
        Iterator itr1 = st1.iterator();

        while (itr1.hasNext()) {
            Student st = (Student) itr1.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);

        }

        System.out.println();
        System.out.println("********************2nd WAY OF Sorting***************************************************");
        System.out.println();
        System.out.println("Sorting by name -->");
        System.out.println();

        ArrayList<Student> name = al;

        Collections.sort(name, new NameComparator());

        Iterator itr = name.iterator();

        while (itr.hasNext()) {

            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);

        }
        System.out.println();
        System.out.println("Sorting by Age   --- >");
        System.out.println();

        ArrayList<Student> age = al;

        Collections.sort(age, new AgeComparator());


        itr = age.iterator();

        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println();
        System.out.println("Sorting by RollNo   --- >");
        System.out.println();

        ArrayList<Student> rollno = al;

        //Collections.sort(rollno, new RollNoComparator());
        rollno.stream().sorted(new RollNoComparator());

        itr = rollno.iterator();

        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

    }

}

class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        // return s1.age.compareTo(s2.age); can't use this compare method for int
        // comparision

        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "AgeComparator [toString()=" + super.toString() + "]";
    }

}

class NameComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        return s1.name.compareTo(s2.name);
    }

    @Override
    public String toString() {
        return "NameComparator []";
    }

}

class RollNoComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.rollno == s2.rollno)
            return 0;
        else if (s1.rollno > s2.rollno)
            return 1;
        else
            return -1;
    }
}
