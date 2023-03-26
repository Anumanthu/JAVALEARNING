package practiceproblems;

/* IMPORTANT: Multiple classes and nested static classes are supported */


//uncomment this if you want to read input.
//imports for BufferedReader

import java.util.ArrayList;
import java.util.Iterator;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {

    public static int n;
    public static int count = 0;

    public static void main(String args[]) throws Exception {
     /* Sample code to perform I/O:
      * Use either of these methods for input

     //BufferedReader
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String name = br.readLine();                // Reading input from STDIN
     System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

*/
        //Scanner
        // Scanner s = new Scanner(System.in);
        //String name = s.nextLine();
        String name = "(()))(";
        // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT


        // Write your code here

        n = name.length();


        ArrayList<Character> al = new ArrayList<Character>();

        for (int j = 0; j < n; j++) {
            al.add(name.charAt(j));
        }


        System.out.println(al);

        Iterator<Character> it = al.iterator();
        while (it.hasNext()) {
            if (it.next().equals(')')) {
                if (al.contains('(')) {
                    al.remove(al.indexOf('('));
                    al.remove(al.indexOf(')'));
                    count = count + 2;

                    System.out.println(al);
                }
            } else if (it.next().equals('(')) {
                if (al.contains(')')) {
                    al.remove(al.indexOf('('));
                    al.remove(al.indexOf(')'));
                    count = count + 2;

                    System.out.println(al);
                }
            }

        }


        System.out.println(count);


    }
}
