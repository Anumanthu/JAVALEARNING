package src.AdvancedPracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPractice {

    public static void main(String args[]) {
        //Lambda expressions

        //    symbol= ->

        ArrayList lst = new ArrayList();
        String[] str = {"anumanthu", "Ravi", "Ramesh", "Kavi"};
        int ints[] = {2, 3, 4, 5};


        Arrays.stream(str).filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

    }
}
