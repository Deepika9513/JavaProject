import java.io.BufferedReader;
import java.io.IOException;

public class prime1 {
    public  static void main(String[] args) throws IOException {
        int count=0;
        int num=7;
        for(int i=2;i<num;i++)
        {
            if (num % i == 0) {
                count++;
            }
        }
if(count>0){

                System.out.println("is not a prime number");}
                else if(count==0) {
                    System.out.println("is a prime number");



            }


        }

    }
