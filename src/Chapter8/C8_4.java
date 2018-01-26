package Chapter8;

import java.util.*;

/**
 * Program displays days, sales on the day and the total
 *
 * @author Elijah Hamlin
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};

        System.out.print("\t\tSu \tM \tT \tW \tTh \tF \tSa \tTotal\n");

        for (int r = 0; r < hours.length; r++) {
            System.out.print("Employee " + r);
            for (int c = 0; c < hours[r].length; c++) {
                System.out.print("\t" + hours[r][c]);
            }
            System.out.println();
        }
    }
}
