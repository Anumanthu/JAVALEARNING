package src.practiceproblems;

import java.util.*;
import java.util.Map.Entry;

public class SortHashMap {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        // addding keys and values to HashMap
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put(9, "Neelesh");
        hm.put(12, "Anumanthu");
        hm.put(7, "Harish");
        hm.put(13, "Rakesh");
        hm.put(4, "Ram");
        hm.put(10, "Ramesh");

        Set<Entry<Integer, String>> set = hm.entrySet();
        Iterator<Entry<Integer, String>> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();

            System.out.println("Key " + entry.getKey() + " Value" + entry.getValue());
        }

        System.out.println("****************************************************************");

        // Sort HashMap by keys using
        // TreeMap IMP...we can only sort HashMap by keys using TreeMap
        // since TreeMap can't accept duplicate keys but duplicate values
        // hence we can't sort HashMap by values using TreeMap

        TreeMap<Integer, String> tm = new TreeMap(hm);

        System.out.println("Sorted HashMap using TreeMap by keys is  " + tm);

        // Sort HashMap by keys using Collections.sort

        List<Object> ls = new ArrayList<Object>(hm.entrySet());

        Collections.sort(ls, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable<String>) ((Map.Entry) (o1)).getValue())
                        .compareTo((String) ((Map.Entry) (o2)).getValue());
            }
        });

        HashMap lmp = new LinkedHashMap<>();

        Iterator it = ls.iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
            lmp.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted HashMap using LinkedHashMp by values is  " + lmp);

    }

}
