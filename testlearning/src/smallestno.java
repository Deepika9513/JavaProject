import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class smallestno {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,smallest,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        a=sc.nextInt();
        System.out.println("enter the second number:");
        b=sc.nextInt();
        System.out.println("enter the third number:");
        c=sc.nextInt();
        temp = (a < b) ? a : c;
        smallest = (temp < c) ? temp : c;
        System.out.println("the smallest number is:"+smallest);



    }
    }

