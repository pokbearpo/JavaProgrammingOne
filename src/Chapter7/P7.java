package Chapter7;

import java.util.*;

/**
 * Program asks user how long an array is then displays contents of the array
 * and the average
 *
 * @author Elijah Hamlin
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double average = 0;

        System.out.println("How many numbers will be read: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        fillArray(numbers, n);

        average = averageArray(numbers, n);

        System.out.println("\nThe average is " + average);

        printArray(numbers);

    }

    /**
     * Method accepts numbers from the user and stores them in an array
     *
     * @param numbers the accepted numbers from the main method
     * @param n the length of the array
     */
    public static void fillArray(int[] numbers, int n) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter " + n + " elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

    }

    /**
     * Method averages the numbers in the arrays
     *
     * @param numbers the accepted numbers from the main method
     * @param n the length of the array
     * @return averages the numbers in the array
     */
    public static double averageArray(int[] numbers, int n) {
        double sum = 0;
        double average = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

        average = sum / n;
        return average;

    }

    /**
     * Method prints the entire array
     *
     * @param numbers the accepted numbers from the main method
     */
    public static void printArray(int[] numbers) {
        System.out.println("\nThe contents of the array: " + Arrays.toString(numbers));
    }
}
