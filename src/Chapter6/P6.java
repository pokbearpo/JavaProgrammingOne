package Chapter6;

import java.util.Scanner;

/**
 * Program takes a dollar amount from user, then asks for what currency to
 * convert to
 *
 * @author Elijah Hamlin
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many Euros does a dollar buy? ");
        double euros = input.nextDouble();

        System.out.println("How many Pound Sterling does a dollar buy? ");
        double pound = input.nextDouble();

        System.out.println("How many Yen does a dollar buy? ");
        double yen = input.nextDouble();

        String option = "";

        while (!option.equalsIgnoreCase("no")) {
            System.out.println("Please enter the number of dollars you want to convert: ");
            double dollars = input.nextDouble();

            System.out.println("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            String selection = input.next();

            if (selection.equalsIgnoreCase("E")) {
                double x = conversion(euros, dollars);
                System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros", dollars, x);
            } else if (selection.equalsIgnoreCase("P")) {
                double x = conversion(pound, dollars);
                System.out.printf("For %.2f dollars, you will be able to buy %.2f Pound Sterlings", dollars, x);

            } else if (selection.equalsIgnoreCase("Y")) {
                double x = conversion(yen, dollars);
                System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen", dollars, x);

            }

            System.out.println("\nAre there more conversions to perform? ");
            option = input.nextLine();

            if (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                System.out.println("Enter \"yes\" to continue or \"no\" to stop: ");
                option = input.nextLine();
            }

        }

    }

    /**
     * Method Conversion converts user's entered amount to selected currency
     * change
     *
     * @param currency the type of currency the dollars is being converted to
     * @param dollars the entered number for conversion from the user
     * @return converted currency
     */
    public static double conversion(double currency, double dollars) {

        if (dollars > 100) {
            dollars /= 5;
        } else if (dollars <= 100) {
            dollars /= 10;
        }

        double convert = currency * dollars;
        return convert;
    }

}
