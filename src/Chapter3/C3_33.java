package Chapter3;

import java.util.Scanner;

/**
 * Program asks weight and price of a package from the user and checks which one
 * has a better price
 *
 * @author Elijah Hamlin
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight and cost for package 1: ");
        int weight1 = input.nextInt();
        double cost1 = input.nextDouble();

        System.out.println("Enter weight and cost for package 2: ");
        int weight2 = input.nextInt();
        double cost2 = input.nextDouble();

        if (weight1 > weight2 && cost1 > cost2) {
            System.out.println("Package #2 has a better price.");
        }

        if (weight1 < weight2 && cost1 < cost2) {
            System.out.println("Package #1 has a better price.");
        }

        if (weight1 > weight2 && cost1 < cost2) {
            System.out.println("Package #1 has a better price.");
        }

        if (weight1 < weight2 && cost1 > cost2) {
            System.out.println("Package #2 has a better price.");
        }

        if (weight1 == weight2 && cost1 == cost2) {
            System.out.println("Both Packages are the same price.");
        }

    }

}
