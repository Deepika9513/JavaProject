import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pass {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value for maths:");
        int maths = Integer.parseInt(br.readLine());
        System.out.println("Enter the value for physics:");
        int physics = Integer.parseInt(br.readLine());
        System.out.println("Enter the value for chemistry:");
        int chemistry= Integer.parseInt(br.readLine());
        int overallpercentage= (maths+physics+chemistry)/3;
        System.out.println("Overall Percentage = " + overallpercentage);
        if(maths>35 && physics>35 && chemistry>35 && overallpercentage>40)
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        }
    }