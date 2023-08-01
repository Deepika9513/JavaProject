import java.io.*;
import java.util.*;
import java.lang.*;

    public class HackerRank1 {

        public static void main(String[] args) {
            String A = "hello";
            String B = "java";
            string_length(A, B);
            lexograpically(A, B);
            convertFirstLetter(A, B);

        }

        public static int string_length(String X, String Y) {

            int len_a = X.length();
            int len_b = Y.length();
            System.out.println(len_a + len_b);
            return 0;
        }
        public static String convertFirstLetter(String a, String b)
        {
            String a1=a.substring(0, 1).toUpperCase() + a.substring(1);
            String b1=b.substring(0, 1).toUpperCase() + b.substring(1);
            System.out.println(a1+" "+b1);
            return a1+b1;
        }
        public static String lexograpically(String p, String q)
        {

            int value=p.compareTo(q);
            if(value>0)
            {
                System.out.println("Yes");
            } else if (value<0) {
                System.out.println("No ");

            }
            else
            {
                System.out.println("Value of A and B are equal");
            }
            return "Value of A and B are equal";

        }

    }
