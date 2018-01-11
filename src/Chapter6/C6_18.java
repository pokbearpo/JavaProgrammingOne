package Chapter6;

import java.util.Scanner;

/**
 * Program checks if the user's inputed password is acceptable
 *
 * @author Elijah Hamlin
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String password = input.nextLine();
        checkPassword(password);

    }
    
    /**
     * Method checks user's password acceptability
     * 
     * @param pass takes user's input from Main Method
     */

    public static void checkPassword(String pass) {
        if (pass.length() < 8) {
            System.out.println("A password must have at least eight characters");
            System.out.println("Invalid Password");
            return;
        }

        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isLetterOrDigit(pass.charAt(i))) {
                System.out.println("A password must consist of only letters and digits");
                System.out.println("Invalid Password");
                return;
            }
        }

        int counter = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            System.out.println("A password must contain at least two digits");
            System.out.println("Invalid password");
            return;
        }

        System.out.println("Valid Password");

    }
}
