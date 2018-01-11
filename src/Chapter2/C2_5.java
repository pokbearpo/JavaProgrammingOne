package Chapter2;

import java.util.Scanner;

/**
 * Program displays gratuity and a total from user input
 *
 * @author Elijah Hamlin
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the total: ");
        double subTotal = input.nextDouble();

        System.out.println("Input the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        double gratuity = (gratuityRate / 100) * subTotal;
        double total = subTotal + gratuity;
        System.out.println("The gratuity is " + gratuity + " and the total is " + total);

    }

}
