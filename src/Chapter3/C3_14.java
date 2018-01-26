package Chapter3;

import java.util.Scanner;

/**
 * Program creates a random integer between 0 or 1, user then guesses what the
 * CPU randomly generated
 *
 * @author Elijah Hamlin
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin = (int) (Math.random() * 2);

        System.out.println("Guess: Heads(0) or tails(1): ");
        int guess = input.nextInt();

        System.out.println("The coin flipped a " + coin);

        if (guess == coin) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("You guessed incorrectly!");
        }

    }

}
