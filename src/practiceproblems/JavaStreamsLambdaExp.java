package practiceproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsLambdaExp {

	public static void main(String[] args) {

		String[] arr = { "Ram", "Ravan", "Laxman", "Ankit", "Divya", "Anitha", "Adam" };

		List<String> al = new ArrayList<String>();
		al = Arrays.asList(arr);

		// Lambada exp...leftside variable -> rightside action

		long count = al.stream().filter(s -> s.startsWith("A")).count();

		System.out.println("No. of names start with A  " + count);

		// Usage of anyMatch/allMatch method

		boolean flag = al.stream().anyMatch(s -> s.equalsIgnoreCase("ADAM"));

		System.out.println(flag);

		// Usage of foreach method

		al.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));

		// Usage of Map method

		al.stream().filter(s -> s.length() > 5).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		// int[] arr2={2,1,1,3,2,4,8,8,7,11,12,12,9,13};

		List<Integer> listInt = Arrays.asList(2, 1, 1, 3, 2, 4, 8, 8, 7, 11, 12, 12, 9, 13);

		// Usage of collect method &sorted &limit

		Stream.of(2, 1, 1, 3, 2, 4, 8, 8, 7, 11, 12, 12, 9, 13).distinct().sorted().collect(Collectors.toList())
				.forEach(s -> System.out.println(" " + s));

		listInt.stream().distinct().sorted().collect(Collectors.toList()).forEach(s -> System.out.println(" " + s));

		listInt.stream().distinct().sorted().limit(3).collect(Collectors.toList())
				.forEach(s -> System.out.println(" " + s));

	}

}
