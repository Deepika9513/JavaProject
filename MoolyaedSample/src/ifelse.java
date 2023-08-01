import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ifelse {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value for a:");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the value for b:");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Enter the value for c:");
        int c = Integer.parseInt(br.readLine());
        if((a<=b) && (a<=c)){
            System.out.println("a is the smallest");
        }
        if(b<=c) {
            System.out.println("b is the smaller than c");
        }
        else {
            System.out.println("c is the smallest");
        }
        }
    }

