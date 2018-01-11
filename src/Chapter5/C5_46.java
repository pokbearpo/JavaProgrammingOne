package Chapter5;

import java.util.Scanner;

/**
 * Program reverses the user's string input
 *
 * @author Elijah Hamlin
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String s = new StringBuffer(word).reverse().toString();
        System.out.println("The reversed string is " + s);
    }

}
