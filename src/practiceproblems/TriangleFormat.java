package practiceproblems;

public class TriangleFormat {

    public static void main(String[] args) {

        System.out.println("Enter any number    ");

        //Scanner sc=new Scanner(System.in);

        //int n=sc.nextInt();
        int n = 3;


        for (int i = n + 1; i > 0; i--) //This is for printing triangle in reverse
        //for(int i=1;i<n+1;i++)
        {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
