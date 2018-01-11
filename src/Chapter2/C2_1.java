package Chapter2;

import java.util.Scanner;

/**
 * Program convert Celsius to Fahrenheit
 *
 * @author Elijah Hamlin
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Celcius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(+celsius + " Celcius is " + fahrenheit + " in Fahrenheit");

    }

}
