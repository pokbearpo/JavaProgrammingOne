package Chapter5;

import java.util.Scanner;

/**
 * Program tallies amount of yes and no votes from user, then displays
 *
 * @author Elijah Hamlin
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yays = 0;
        int nays = 0;
        int notValid = 0;

        System.out.println("Enter Y to vote yes, N to vote no, or Q to quit voting: ");
        String vote = input.nextLine();

        while (!vote.equalsIgnoreCase("Q")) {

            if (vote.equalsIgnoreCase("y")) {
                yays++;
            } else if (vote.equalsIgnoreCase("n")) {
                nays++;
            } else if (vote != "Y" && vote != "y" && vote != "N" && vote != "n" && vote != "q") {
                System.out.println("\nINVALID CODE");
            }
            notValid++;
            System.out.println("Enter another vote");
            vote = input.nextLine();
        }

        System.out.println("\nYes votes: " + yays);
        System.out.println("No votes: " + nays);

    }
}
