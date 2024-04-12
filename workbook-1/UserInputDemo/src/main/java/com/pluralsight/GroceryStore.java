package com.pluralsight;
// ask user for their name
// display the product & price
// ask for quantity
// calculate total and display
// ask for money
// give change back

import java.util.Scanner;

public class GroceryStore
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        // declare variables
        final String PRODUCT = "Milka Aplenmilch";
        final double PRICE = 2.99;

        // input variables;
        String customerName;
        int quantity;
        double totalPrice;

        // calculated
        double cashReceived;
        double changeReturned;


       // get user input
        System.out.println("Please enter your name: ");
        customerName = userInput.nextLine(); // it's where the user write his name

        System.out.printf("The product of the day is %s for $ %.2f each. \n", PRODUCT, PRICE);
        System.out.println();

        System.out.print("How many would you like to puy? ");
        quantity = userInput.nextInt();


       // Calculations
        totalPrice = PRICE * quantity;

        System.out.printf("The total is %.2f \n", totalPrice);

        System.out.print("Please enter your cash amount: ");
        cashReceived = userInput.nextInt();

        changeReturned = cashReceived - totalPrice;

        // display the receipt
        // option 1 for formatting
        // System.out.println();
        // String message = String.format("Total: %.2f", totalPrice);

        // option 2 for formatting
        System.out.printf("Welcome %s. \n", customerName);
        System.out.printf("Total:  $ %10.2f \n" , totalPrice);
        System.out.printf("Cash:   $ %10.2f \n" , cashReceived);
        System.out.printf("Change: $ %10.2f \n" , changeReturned);

    }
}