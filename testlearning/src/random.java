import java.util.Random;

public class random {
    public static void main(String[] args) {
        int randomNumber = getRandomNumber();
        System.out.println("Random number: " + randomNumber);
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        int randomInt = rand.nextInt(1000);
        return randomInt;
    }
}
