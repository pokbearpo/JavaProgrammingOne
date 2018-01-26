package Chapter7;

import java.util.*;

/**
 * Program take user input of student count and scores, then finds the grade
 * given to each student
 *
 * @author Elijah Hamlin
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int[] students = new int[input.nextInt()];

        System.out.println("Enter " + students.length + " scores: ");
        for (int i = 0; i < students.length; i++) {
            students[i] = input.nextInt();
        }

        Arrays.sort(students);
        int best = students[students.length - 1];

        System.out.println("Best: " + best);

        for (int i = 0; i < students.length; i++) {
            if (students[i] >= best - 10) {
                System.out.println("Student " + i + " score is " + students[i] + " and grade is A.");
            } else if (students[i] >= best - 20) {
                System.out.println("Student " + i + " score is " + students[i] + " and grade is B.");
            } else if (students[i] >= best - 30) {
                System.out.println("Student " + i + " score is " + students[i] + " and grade is C.");
            } else if (students[i] >= best - 40) {
                System.out.println("Student " + i + " score is " + students[i] + " and grade is D.");
            } else {
                System.out.println("Student " + i + " score is " + students[i] + " and grade is F.");
            }
        }

    }

}
