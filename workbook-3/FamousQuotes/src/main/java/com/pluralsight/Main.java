package com.pluralsight;
import java.util.Scanner;


public class Main {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String[] quotes = {
                "The only way to do great work is to love what you do.",
                "In the middle of difficulty lies opportunity.",
                "Life is what happens when you're busy making other plans.",
                "Believe you can and you're halfway there.",
                "The best way to predict the future is to create it.",
                "Success is not final, failure is not fatal: It is the courage to continue that counts.",
                "Be yourself; everyone else is already taken.",
                "The only limit to our realization of tomorrow will be our doubts of today.",
                "The greatest glory in living lies not in never falling, but in rising every time we fall.",
                "It does not matter how slowly you go as long as you do not stop.",
        };

        do {
            try {
                System.out.print("Select a number between 1 and 10: ");
                int index = userInput.nextInt();
                if (index >= 1 && index <= 10) {
                    System.out.println(quotes[index - 1]);
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
            }
            System.out.print("Do you want to see another saying? (yes/no): ");
            String choice = userInput.next();
                if (!choice.equalsIgnoreCase("yes")) {
                break;}
            }
        while (true);
    }
}



