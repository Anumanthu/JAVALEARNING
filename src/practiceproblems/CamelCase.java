package src.practiceproblems;

public class CamelCase {

    public static void main(String[] args) {

//       Example
//       Count no of words in given String/sentence
//       There are  words in the string: 'one', 'Two', 'Three'.

        //String str="saveChangesInTheEditor";
        String str = "oneTwoThree";
        System.out.println("No of words " + camelcase(str));
    }

    public static int camelcase(String s) {
        String[] str = s.split("[A-Z]");
        return str.length;


    }


}
