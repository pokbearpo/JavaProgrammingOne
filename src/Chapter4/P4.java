package Chapter4;

import java.util.Scanner;

/**
 * Program shows best bidders pay rate and required hours
 *
 * @author Elijah Hamlin
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * Bidder #1 *
         */
        System.out.println("Bidder #1 Name: ");
        String bidder1 = input.next();

        System.out.println("How many required hours: ");
        double bid1Hours = input.nextDouble();

        System.out.println("Charge per hour: ");
        double bid1_payRate = input.nextDouble();

        /**
         * Bidder #2 *
         */
        System.out.println("\nBidder #2 Name: ");
        String bidder2 = input.next();

        System.out.println("How many required hours: ");
        double bid2Hours = input.nextDouble();

        System.out.println("Charge per hour: ");
        double bid2_payRate = input.nextDouble();

        /**
         * Calculate Costs *
         */
        double cost1 = bid1Hours * bid1_payRate;
        double cost2 = bid2Hours * bid2_payRate;

        /**
         * Comparing Costs *
         */
        if (cost1 < cost2) {
            System.out.println("\nWinner is " + bidder1);
            System.out.printf("Total cost is %.2f", cost1);
        }

        if (cost2 < cost1) {
            System.out.println("Winner is " + bidder2);
            System.out.printf("Total cost is %.2f", cost2);
        }

        if (cost1 == cost2 && bid1Hours < bid2Hours) {
            System.out.println("\nWinner is " + bidder1);
            System.out.printf("Total cost is %.2f", cost1);
            System.out.println("Hours: " + bid1Hours);
        }

        if (cost1 == cost2 && bid1Hours > bid2Hours) {
            System.out.println("Winner is " + bidder2);
            System.out.printf("Total cost is %.2f" + cost2);
            System.out.println("Hours: " + bid2Hours);
        }

        if (cost1 == cost2 && bid1Hours == bid1Hours) {
            System.out.println("\nBoth " + bidder1 + " and " + bidder2 + " have identical bids.");

            System.out.println("\nNumber of hours:");
            System.out.println("Bidder 1 Hours: " + bid1Hours + "\nBidder 2 Hours: " + bid2Hours);

            System.out.println("\nCost per hour:");
            System.out.printf("Bidder 1: $%.2f", bid1_payRate);
            System.out.printf("\nBidder 2: $%.2f", bid2_payRate);
            System.out.println("\n");

            System.out.println("Total Cost:");
            System.out.printf("Bidder 1: $%.2f", cost1);
            System.out.printf("\nBidder 2: $%.2f", cost2);

        }
    }
}
