package com.pluralsight;

import java.util.Scanner;

public class HighScore {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        System.out.print("Please enter a game score: ");
        String score = userInput.nextLine();


        String[] parts = score.split("[|:]");
        String home1 = parts[0];
        String visitorTeam = parts[1];
        int score1 = Integer.parseInt(parts[2]);
        int score2 = Integer.parseInt(parts[3]);



        String winner;
        if (score1 > score2) {
            winner = home1;
        } else {
            winner = visitorTeam;
        }

        // Displaying the name of the winning team
        System.out.println("Winner: " + winner);
    }
}

