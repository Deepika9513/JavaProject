

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int a,b;
       Scanner s=new Scanner(System.in);
       System.out.println("enter the first number:");
       a=Integer.parseInt(s.readline());
       System.out.println("enter the second number:");
       b=Integer.parseInt(s.readline());
       while (true) {
           System.out.println("select an option");
           System.out.println("1.Add");
           System.out.println("2.Subtraction");
           System.out.println("3.Multiply");
           System.out.println("4.Division");
           System.out.println("5.exit");
           System.out.println("Type your selection here");
           String choice=s.readLine();
           switch(choice)
           {
               case 1:
                   System.out.println("Sum="+(a+b));
                    break;
               case 2:
                   System.out.println("Difference="+(a-b));
                   break;
               case 3:
                   System.out.println("Multiply="+(a*b));
                   break;
               case 4:
                   System.out.println("Division="+(a/b));
                   break;
               case 5:
                   System.exit(0);
                   break;

           }
           }
    }
}