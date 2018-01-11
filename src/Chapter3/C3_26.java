package Chapter3;

import java.util.Scanner;

/**
 * Program checks if user's input is divisible by 5 or 6
 *
 * @author Elijah Hamlin
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(+number + " is divisible by 5 and 6.");
        }

        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println(+number + " is divisible by 5 or 6.");
        }

        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println(+number + " is divisible by 5 or 6, but not both.");
        }

    }

}
