package Chapter3;

import java.util.Scanner;

/**
 * Program checks if the user input are greater than, less than, or equal to the
 * two integers
 *
 * @author Elijah Hamlin
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter a second integer: ");
        int number2 = input.nextInt();

        if (number1 < number2) {
            System.out.println("The first number is less than the second.");
        }
        if (number1 > number2) {
            System.out.println("The first number is greater than the second.");
        }
        if (number1 == number2) {
            System.out.println("The first number is equal to the second.");
        }
        /**
         * --------------------------------------------------------------- *
         */

        if (number1 <= number2) {
            System.out.println("The first number is less than or equal to the second.");
        }

        if (number1 != number2) {
            System.out.println("The first number is not equal to the second.");
        }

        if (number2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (number1 / number2 < 1) {
            System.out.println("Proper fraction.");
        } else {
            System.out.println("Improper fraction.");
        }
        /**
         * --------------------------------------------------------------- *
         */

        if (number1 >= 90) {
            System.out.println("A");
        } else if (number1 >= 80) {
            System.out.println("B");
        } else if (number1 >= 70) {
            System.out.println("C");
        } else if (number1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        /**
         * --------------------------------------------------------------- *
         */

        if (number2 >= 1 || number2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }

}
