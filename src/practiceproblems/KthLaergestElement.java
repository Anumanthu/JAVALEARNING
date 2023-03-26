package src.practiceproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KthLaergestElement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> lst = Arrays.asList(5, 14, 23, 45, 7, 3, 9, 18);

        lst = lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int n = 2;
        System.out.println(lst);
        System.out.println(lst.get(n));

    }

}
