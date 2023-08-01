import java.util.Scanner;
import java.util.InputMismatchException;

public class tryc {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                Scanner sc = new Scanner((System.in));
                System.out.println("Enter your Number");
                int n = sc.nextInt();
                System.out.println(100 / n);
            } catch (ArithmeticException e) {
                System.out.println("because of arithmetic overflow");
            } catch (NumberFormatException e) {
                System.out.println("Because of NumberFormatException");
            } catch (Exception e) {
                System.out.println("Because of Exception");

            }

        }
    }
}


