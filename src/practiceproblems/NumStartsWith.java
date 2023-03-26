package src.practiceproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartsWith {

    public static void main(String args[]) {
        List<Integer> lst = Arrays.asList(22, 354, 234, 864, 222, 24, 845, 340, 2, 456, 432);
        List<Integer> StartsWitNum = lst.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2"))
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());

        System.out.println("Numbers are " + StartsWitNum);
    }
}
