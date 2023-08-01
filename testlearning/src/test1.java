import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1{
        public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value for a");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the value for b");
        int b = Integer.parseInt(br.readLine());
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        }
        }

