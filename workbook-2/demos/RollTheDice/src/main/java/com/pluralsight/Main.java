package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1, roll2, sum;

        int counter2 = 0, counter4 = 0, counter6 = 0, counter7 = 0;

        for (int i = 1; i <= 100; i++)
        { // Roll the dice 100 times
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            System.out.printf("Roll %d: %d - %d  Sum: %d\n", i, roll1, roll2, sum);

            // Count occurrences of 2, 4, 6, and 7
            if (sum == 2) counter2++;
            else if (sum == 4) counter4++;
            else if (sum == 6) counter6++;
            else if (sum == 7) counter7++;
        }


        // Display counters
        System.out.println("--------------------------");
        System.out.printf("Number of times 2 is rolled: %d\n", counter2);
        System.out.printf("Number of times 4 is rolled: %d\n", counter4);
        System.out.printf("Number of times 6 is rolled: %d\n", counter6);
        System.out.printf("Number of times 7 is rolled: %d\n", counter7);
    }
}
