package src.practiceproblems;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaPredicateFunctionConsumerSupplierInterface {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Predicate interface it will return boolean type. Predicate<inputvalue> and
        // return boolean based on the
        // condition specified in the Lambda expression

        Predicate<Integer> s = b -> (b > 30);

        System.out.println(s.test(20));// false

        Predicate<String> s1 = str -> (str.length() > 6);

        List<String> lst = Arrays.asList("Bheema Reddy", "Divya", "Neha", "Nandini");

        lst.stream().forEach(st -> {

            if (s1.test(st)) {
                System.out.println(st);
            }
        });

        // Function<inputvalue,retruntype>f1=s->s*s;
        Function<Integer, Integer> f1 = n -> n * n;

        System.out.println(f1.apply(5));
        System.out.println(f1.apply(2));
        System.out.println(f1.apply(4));

        // Consumer<inputvalue> does not return any value

        Consumer<String> cos = consumer -> System.out.println(consumer);

        cos.accept("Consumer");

        // Supplier<> does not take any input value but return some value

        Supplier supp = () -> "Supplier";

        System.out.println(supp.get());

        Supplier supp1 = () -> LocalDate.now();//new Date();

        System.out.println(supp1.get());

//		Student stu = new Student("Bheema Reddy", 32);
//		stu = new Student("Bheema Reddy", 32);
//		List<Student> lstStudents = Arrays.asList(new Student("Bheema Reddy", 32), new Student("Divya", 5),
//				new Student("Nandini", 24), new Student("Neha", 32));
//		
//		lstStudents.stream().forEach(st -> {
//
//			if (s1.test(st.getName())) {
//				System.out.println(st.getName());
//			}
//		});
//

    }

}

//class Student
//{
//	private String name;
//	private int age;
//
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//}
