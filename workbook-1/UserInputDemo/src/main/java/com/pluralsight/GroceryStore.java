package com.pluralsight;
// ask user for their name
// display the product & price
// ask for quantity
// calculate total and display
// ask for money
// give change back


public class GroceryStore
{
    public static void main(String[] args)
    {
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
        customerName = "Bob";
        quantity = 5;


       // Calculations
        totalPrice = PRICE * quantity;
        cashReceived = 20;
        changeReturned = cashReceived - totalPrice;

        // display the receipt
        // option 1 for formatting
        // System.out.println();
        // String message = String.format("Total: %.2f", totalPrice);

        // option 2 for formatting

        System.out.printf("Total:  $ %10.2f \n" , totalPrice);
        System.out.printf("Cash:   $ %10.2f \n" , cashReceived);
        System.out.printf("Change: $ %10.2f \n" , changeReturned);

    }
}