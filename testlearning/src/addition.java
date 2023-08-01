import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addition {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        System.out.println("enter your choice");
        int ch=Integer.parseInt(br.readLine());
        switch (ch) {
            case 1:
                System.out.println("you are doing addition");
                System.out.println(a + b);
                break;
            case 2:
                System.out.println("you are doing a subtraction");
                System.out.println(a - b);
                break;
            default:
                System.out.println("wrong input given");

        }
        }
    }


