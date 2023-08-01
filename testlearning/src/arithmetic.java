import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arithmetic {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int a,b,choice;

       System.out.println("enter the first number:");
       a=Integer.parseInt(br.readLine());
       System.out.println("enter the second number:");
       b=Integer.parseInt(br.readLine());
       while (true) {
           System.out.println("select an option");
           System.out.println("1.Add");
           System.out.println("2.Subtraction");
           System.out.println("3.Multiply");
           System.out.println("4.Division");
           System.out.println("5.exit");
           System.out.println("Type your selection here");
           choice=Integer.parseInt(br.readLine());
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

               default:
                   throw new IllegalStateException("Unexpected value: " + choice);
           }
           }
    }
}