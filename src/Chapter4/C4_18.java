package Chapter4;

import java.util.Scanner;

/**
 * Program checks major and grade number from entered user input
 *
 * @author Elijah Hamlin
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter major (first letter): ");
        String major = input.next();

        System.out.println("Enter grade (use 1 - 4): ");
        int grade = input.nextInt();
        String gradeName = ("");

        switch (grade) {
            case 1:
                gradeName = ("Freshman");
                break;
            case 2:
                gradeName = ("Sophomore");
                break;
            case 3:
                gradeName = ("Junior");
                break;
            case 4:
                gradeName = ("Senior");
                break;
            default:
                System.out.println("Invalid Input.");
                System.exit(0);
        }

        if (major.charAt(0) == 'M' || major.charAt(0) == 'm') {
            System.out.println("Mathmatics " + gradeName);
        } else if (major.charAt(0) == 'C' || major.charAt(0) == 'c') {
            System.out.println("Computer Science " + gradeName);
        } else if (major.charAt(0) == 'I' || major.charAt(0) == 'i') {
            System.out.println("Information Technology " + gradeName);
        } else {
            System.out.println("Invalid Input.");
        }

    }
}
