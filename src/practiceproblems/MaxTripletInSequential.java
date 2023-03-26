package src.practiceproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MaxTripletInSequential {
    public static HashMap<Integer, Integer> hm;

    public static void main(String[] args) {

        int a[] = {3, 54, 5, 79, -45, 9, 78, 0, 0, 34, -35, 36, 45, 2, 3, 89, -3, -4, 112, 36, 92, 12, 5, 97};

        hm = new HashMap<Integer, Integer>();

        // List<Integer> al=Arrays.asList(a);
        MaxTripletInSequential obj = new MaxTripletInSequential();

        List<Integer> al = Arrays.asList(3, 54, 5, 79, -45, 9, 78, 0, 0, 34, -35, 36, 45, 2, 3, 89, -3, -4, 112, 36, 92,
                12, 5, 97);

        // al.stream().map(s->obj.tripletSum(al, s,hm));

        // al.stream().forEach(s->obj.tripletSum(al, s, hm));

        List<Integer> result = al.stream().map(s -> obj.tripletSum(al, s)).toList();

        System.out.print(hm);
        int maxSum = 0;
        int maxIndex = 0;

//		for(int i=0;i<hm.size();i++)
//		{
//			if(hm.get(i)>maxSum)
//			{
//				maxSum=hm.get(i);
//				maxIndex=i;
//			}
//		}

        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) > maxSum) {
                maxSum = result.get(i);
                maxIndex = i;
            }
        }

        System.out.println();
        System.out.println("Max sum is " + maxSum);

        System.out.println("Values are  " + maxIndex + ", " + (maxIndex + 1) + ", " + (maxIndex + 2));
    }

    public int tripletSum(List<Integer> al, int s, HashMap<Integer, Integer> hm) {
        int index = al.indexOf(s);
        if (index < (al.size() - 2)) {
            hm.put(hm.size(), al.get(index) + al.get(index + 1) + al.get(index + 2));
            return hm.get(hm.size() - 1);

        }
        return -999999;
    }

    public int tripletSum(List<Integer> al, int s) {
        int index = al.indexOf(s);
        if (index < (al.size() - 2)) {
            return al.get(index) + al.get(index + 1) + al.get(index + 2);

        }
        return -999999;
    }

}
