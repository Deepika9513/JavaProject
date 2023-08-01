import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class square {
        public static void main (String[] args) {
            System.out.println("enter any number");
            Scanner sc = new Scanner(System.in);
            double number=sc.nextDouble();
            if (CheckPerfectSquare(number))
                System.out.println("yes,The given number is perfect square");
            else
                System.out.println("no,The given number is not a perfect square");

        }
    private static boolean CheckPerfectSquare(double number)
        {
            int i;
            for (i=1;i*i<=number;i++)
            {
                if((number%i==0)&&(number/i==i))
            {
                return true;
        }
        }
        return false;
}
}





