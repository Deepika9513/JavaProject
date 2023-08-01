import java.util.Scanner;
import java.io.IOException;

public class discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter total cost");
        double totalcost = input.nextDouble();
        if (totalcost >= 2000)
        {
            double discount =.05;
            double totalAmount=totalcost-(totalcost*discount);
            System.out.println("The Total Amount to be paid by the customer after availing the discount."+ totalAmount);
        } else if (totalcost > 2000 && totalcost <= 5000) {
            double discount =.25;
            double totalAmount=totalcost-(totalcost*discount);
            System.out.println("The Total Amount to be paid by the customer after availing the discount."+ totalAmount);
        }
        else if (totalcost > 5000 && totalcost <= 10000) {
            double discount =.35;
            double totalAmount=totalcost-(totalcost*discount);
            System.out.println("The Total Amount to be paid by the customer after availing the discount."+ totalAmount);
        }
        else if (totalcost > 10000) {
            double discount =.5;
            double totalAmount=totalcost-(totalcost*discount);
            System.out.println("The Total Amount to be paid by the customer after availing the discount."+ totalAmount);
        }
        else
            System.out.println("No discount and the total amount is :"+ totalcost);
    }

    }

