package Chapter7;

import java.util.*;

/**
 * Program gains ten numbers from user, and checks which is the minimum number
 * entered
 *
 * @author Elijah Hamlin
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double minimum = min(numbers);

        System.out.println("\nThe minimum number is: " + minimum);
    }

    /**
     * Method finds the minimum of the array
     *
     * @param array takes the ten numbers entered from the main method
     * @return returns the minimum of the array
     */
    public static double min(double[] array) {
        Arrays.sort(array);
        double minimum = array[0];

        return minimum;

    }
}
