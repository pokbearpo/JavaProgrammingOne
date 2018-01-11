package Chapter2;

import java.util.Scanner;

/**
 * Program displays area and volume from user input
 *
 * @author Elijah Hamlin
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the radius: ");
        double radius = input.nextDouble();

        System.out.println("Now, enter the length: ");
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println(+area + " is your area and " + volume + " is your volume.");
    }

}
