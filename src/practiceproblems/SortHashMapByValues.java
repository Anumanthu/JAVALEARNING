package src.practiceproblems;

import java.util.*;

public class SortHashMapByValues {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        //addding keys and values to HashMap
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put(9, "Neelesh");
        Iterator<Integer> it = hm.keySet().iterator();
        System.out.println("Before Sorting Hash Map");
        System.out.println(hm);

        TreeMap<Integer, String> tm = new TreeMap<>(hm);
        System.out.println("Tree Map is " + tm);

        List<Map.Entry<Integer, String>> l = new ArrayList<>(hm.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("After sorting HashMap by Values " + l);

        HashMap<Integer, String> lmp = new LinkedHashMap<>();//copy all list values to linked hash map to preserve the order
        Iterator<Map.Entry<Integer, String>> itr = l.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> m = itr.next();
            lmp.put(m.getKey(), m.getValue());
        }

        System.out.println("After sorting HashMap by Values and stored Linked Hash Map to preserve the insertion order " + lmp);


//        System.out.println("Sort ArrayList in reverse order: ");
//        l.sort(Collections.reverseOrder());
//        System.out.println(l);
    }
}


