package javaAdvanced;

import java.util.*;
import java.util.Map.Entry;

public class HashMapexple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		hm.put(3, "evening2");// Key 3 contains evening since it is over writes the value evening with
								// evening2
		hm.put(4, "Divya");
		hm.put(5, "Divya");// containing duplicate values

		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));

		System.out.println(hm.get(3));

		System.out.println(hm);

		hm.put(42, "morning");
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();

		// hashtable -pass table set collections

		while (it.hasNext()) {
			// System.out.println(it.next());
			Map.Entry<Integer, String> mp = (Entry<Integer, String>) it.next();
			System.out.print(mp.getKey());
			System.out.print("  " + mp.getValue());

			System.out.println("");

			// System.out.println(((Map.Entry)it.next()).getValue());
		}

	}
}
