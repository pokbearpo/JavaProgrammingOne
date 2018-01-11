package Chapter2;

import java.util.Scanner;

/**
 * Program displays food cost, tax, tip, and the meal cost from user input
 *
 * @author Elijah Hamlin
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Price of meal: ");
        double mealPrice = input.nextDouble();

        System.out.println("Price of drink: ");
        double drinkPrice = input.nextDouble();

        System.out.println("Price of dessert: ");
        double dessertPrice = input.nextDouble();

        double foodCost = mealPrice + drinkPrice + dessertPrice;
        double salesTax = foodCost * 0.10;
        double tip = (foodCost + salesTax) * 0.15;
        double totalCost = foodCost + salesTax + tip;

        System.out.println("Food price is " + foodCost + " your tax is " + salesTax
                + " and the tip is " + tip + " so your final cost is " + totalCost);

    }
}
