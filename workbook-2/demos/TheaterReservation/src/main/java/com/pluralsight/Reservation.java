package com.pluralsight;

import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        System.out.print("Please enter your name: ");
        String fullName = userInput.nextLine();


        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = userInput.nextLine();


        System.out.print("How many tickets would you like? ");
        int numTickets = userInput.nextInt();


        String[] names = fullName.split(" ");
        String firstName = names[0];
        String lastName = names[names.length - 1];


        if (numTickets == 1) {
            System.out.println("1 ticket reserved on " + date + " for " + lastName + ", " + firstName);
        }
        else {
            System.out.println(numTickets + " tickets reserved on " + date + " for " + lastName + ", " + firstName);
        }
    }
}
