package Chapter8;

import java.util.*;

/**
 * Program asks user for salesman, day, and amount of the sale
 *
 * @author Elijah Hamlin
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] salesmanID = {"A", "B", "C", "D"};
        String[] daysID = {"M", "T", "W", "H", "F"};

        double[][] sale = new double[4][5];
        String yes_no;

        do {
            System.out.println("Enter the salesman ID as A, B, C, or D: ");
            String salesman = input.next();

            if (!salesman.equalsIgnoreCase("A") && !salesman.equalsIgnoreCase("B") && !salesman.equalsIgnoreCase("C") && !salesman.equalsIgnoreCase("D")) {
                System.out.println("Enter a correct salesman ID (A, B, C, or D): ");
                salesman = input.next();
            }

            System.out.println("Enter the day as M, T, W, H, or F: ");
            String day = input.next();

            if (!day.equalsIgnoreCase("M") && !day.equalsIgnoreCase("T") && !day.equalsIgnoreCase("W") && !day.equalsIgnoreCase("H") && !day.equalsIgnoreCase("F")) {
                System.out.println("Enter a correct day ID (M, T, W, H, or F): ");
                day = input.next();
            }

            sale = salesList(salesmanID, daysID, salesman, day, sale);
            do {
                System.out.println("More data? Enter Y for more or N to stop: ");
                yes_no = input.next();
            } while (!yes_no.equalsIgnoreCase("y") && !yes_no.equalsIgnoreCase("n") && !yes_no.equalsIgnoreCase("N") && !yes_no.equalsIgnoreCase("Y"));

        } while (yes_no.equalsIgnoreCase("y"));

        System.out.println("    M   T    W   H   F");
        System.out.println("A [" + sale[0][0] + " " + sale[0][1] + " " + sale[0][2] + " " + sale[0][3] + " " + sale[0][4] + "]");
        System.out.println("B [" + sale[1][0] + " " + sale[1][1] + " " + sale[1][2] + " " + sale[1][3] + " " + sale[1][4] + "]");
        System.out.println("C [" + sale[2][0] + " " + sale[2][1] + " " + sale[2][2] + " " + sale[2][3] + " " + sale[2][4] + "]");
        System.out.println("D [" + sale[3][0] + " " + sale[3][1] + " " + sale[3][2] + " " + sale[3][3] + " " + sale[3][4] + "]");
    }

    /**
     * Method asks for the salesman, day, and then asks for the amount of the
     * sale
     *
     * @param salesmanID takes letter of the salesman from an array
     * @param daysID takes letter of the day from an array
     * @param salesman takes the entered letter from salesman array
     * @param day takes the entered letter from day array
     * @param total takes the total from each column and row
     * @return returns the total
     */

    public static double[][] salesList(String[] salesmanID, String[] daysID, String salesman, String day, double[][] total) {
        Scanner input = new Scanner(System.in);

        int row = java.util.Arrays.binarySearch(salesmanID, salesman);
        int column = 0;

        for (int i = 0; i < daysID.length; ++i) {
            if (daysID[i].equals(day)) {
                column = i;
            }
        }

        System.out.println("Enter amount of the sale for " + salesman + " on " + day);
        double price = input.nextDouble();

        total[row][column] += price;
        return total;
    }
}
