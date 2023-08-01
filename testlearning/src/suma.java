import java.lang.*;

public class suma {
    public static void main(String[] args) {
        String A = "Aaron";
        String B = "aaron";
        string_length(A, B);
        convertFirstLetter(A, B);
        lexograpically(A, B);

    }

    public static int string_length(String X, String Y) {

        int len_a = X.length();
        int len_b = Y.length();
        System.out.println("print the sum of " + len_a + " and " + len_b + " is " + (len_a + len_b));
        if (len_a > len_b) {
            System.out.println("a is greater");
            return len_a;
        } else
        {
            System.out.println("b is greater");
            return 0;
        }
    }
    public static String convertFirstLetter(String a, String b)
    {
       String a1=a.substring(0, 1).toUpperCase() + a.substring(1);
       String b1=b.substring(0, 1).toUpperCase() + b.substring(1);
       System.out.println("A is " + a1);
       System.out.println("B is " + b1);
       return a1+b1;
    }
    public static String lexograpically(String p, String q)
    {

        System.out.println("Comparing strings with compareTo:");
        int value=p.compareTo(q);
        if(value>0)
        {
            System.out.println("Value of A is lexographically larger than value of B ");
        } else if (value<0) {
            System.out.println("Value of B is lexographically larger than value of A ");

        }
        else
            System.out.println("Value of A and B are equal");
        return "Value of A and B are equal";

    }
}



