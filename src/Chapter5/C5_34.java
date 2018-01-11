package Chapter5;

import java.util.Scanner;

/**
 * Program plays rock, paper, scissors with the user
 *
 * @author Elijah Hamlin
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerWins = 0;
        int playerWins = 0;
        while (playerWins != 2 && computerWins != 2) {
            int computer = (int) (Math.random() * 3);
            System.out.println("Rock(0), Paper(1), or Scissors(2): ");
            int player = input.nextInt();
            if (player == 0 && computer == 1) {
                System.out.println("Computer is paper. You lose.\n");
                computerWins += 1;

            } else if (player == 0 && computer == 2) {
                System.out.println("Computer is scissors. You win!\n");

                playerWins += 1;

            } else if (player == 1 && computer == 0) {
                System.out.println("Computer is rock. You win!\n");
                playerWins += 1;

            } else if (player == 1 && computer == 2) {
                System.out.println("Computer is scissors. You lose.\n");
                computerWins += 1;

            } else if (player == 2 && computer == 0) {
                System.out.println("Computer is rock. You lose.\n");
                computerWins += 1;

            } else if (player == 2 && computer == 1) {
                System.out.println("Computer is paper. You win!\n");
                playerWins += 1;

            } else if (player == computer) {
                System.out.println("You both tied.\n");
            }
        }
        if (playerWins == 2) {
            System.out.println("\nYou beat the computer! Congratulations!");
        }
        if (computerWins == 2) {
            System.out.println("\nThe computer beat you! Better luck next time...");
        }
    }
}
