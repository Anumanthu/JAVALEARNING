package src.practiceproblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortCharDigits {

    public static void main(String[] args) {
        String s = "AXYED54PQ12";

        // String Y="ADEPQXY1245";

        //Arrays.sort(s,Comparator.reverseOrder());

        List<String> ls = Arrays.asList(s);

        Collections.sort(ls);

//        StreamSupport.stream((Spliterator<T>) s.chars(), false);

        //System.out.println(ls);
        System.out.println(charDigitsSorted(s));
    }

    public static String charDigitsSorted(String str) {

        String Z = "0123456789";

        String D = "";
        String E = "";
        String returnDesired = "";

        for (int i = 0; i < str.length(); i++) {

            if (Z.contains(String.valueOf(str.charAt(i)))) {
                D = D + str.charAt(i);
            } else {
                E = E + str.charAt(i);
            }
        }

        char[] digits = D.toCharArray();
        char[] chars = E.toCharArray();

        Arrays.sort(digits);
        Arrays.sort(chars);

        //returnDesired = String.valueOf(E) + String.valueOf(D);
        returnDesired = String.valueOf(chars) + String.valueOf(digits);


        // commented below logic is not a good approach
//		D = D + E;
//		
//		
//		//System.out.println(D);
//
//		char F[] = D.toCharArray();
//		
//		
//		D="";
//
//		System.out.println();
//		Arrays.sort(F);
//		
//		//Collections.reverseOrder();
//		
//		//Arrays.sort(F, Collections.reverseOrder());
//		for(int i=0;i<F.length;i++)
//		{
//			//System.out.print(F[i]);
//			
//			D=D+F[i];
//		}
//		System.out.println(F.toString());

        return returnDesired;

    }

}
