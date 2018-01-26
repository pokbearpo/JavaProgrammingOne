package Chapter7;

import java.util.*;

/**
 * Program checks if two lists are identical
 *
 * @author eh0988930
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list 1: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("\nEnter list 2: ");
        int[] list2 = new int[input.nextInt()];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        boolean equals = equals(list1, list2);

        if (equals == true) {
            System.out.println("\nTwo lists are strictly identical.");
        } else if (equals == false) {
            System.out.println("\nTwo lists are not strictly identical.");
        }
    }

    /**
     * Method checks if the lists are equal
     *
     * @param list1 takes the list first entered
     * @param list2 takes the list secondly entered
     * @return method returns true or false if the lists are equal
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (Arrays.equals(list1, list2)) {
            return true;
        } else {
            return false;
        }
    }
}
