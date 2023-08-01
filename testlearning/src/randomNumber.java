import java.text.SimpleDateFormat;
import java.util.Date;

public class randomNumber {
    public static void main(String[] args)
    {
        // create a method random number
        String RandomNumber = getRandomNumber();
        System.out.println(RandomNumber);

    }

    public static String getRandomNumber() {
        String random= new SimpleDateFormat("SSS").format(new Date());
        return random;
    }
}