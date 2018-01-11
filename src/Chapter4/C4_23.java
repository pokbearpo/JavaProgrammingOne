package Chapter4;

import java.util.Scanner;

/**
 * Program displays Name, pay rates and taxes from user input
 *
 * @author Elijah Hamlin
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name: ");
        String name = input.next();

        System.out.println("Enter hours worked in a week: ");
        int hours = input.nextInt();

        System.out.println("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        System.out.println("Enter state tax witholding rate: ");
        double stateTax = input.nextDouble();

        /**
         * Find Gross Pay *
         */
        double grossPay = payRate * hours;

        /**
         * Find Federal Tax *
         */
        double fedTax = grossPay * federalTax;

        /**
         * Find State Tax *
         */
        double stTax = grossPay * stateTax;

        /**
         * Total Deduction *
         */
        double deduction = fedTax + stTax;

        /**
         * Net Pay *
         */
        double netPay = grossPay - deduction;

        /**
         * Outputs *
         */
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.printf("Pay Rate: %.2f", payRate);
        System.out.printf("\nGross Pay: %.2f", grossPay);
        System.out.println("\n\nDeductions:");

        System.out.printf("Federal Withholding (" + federalTax + "): %.2f", fedTax);
        System.out.printf("\nState Withholding (" + stateTax + "): %.2f", stTax);
        System.out.printf("\nTotal Deduction: %.2f", deduction);

        System.out.printf("\nNet Pay: %.2f", netPay);

    }
}
