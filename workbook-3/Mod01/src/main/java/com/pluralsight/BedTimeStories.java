package com.pluralsight;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedTimeStories
{

    public static void main(String[] args)
    {
        while(true)
        {
            String filePath = promptUserForStory();

            if(filePath.equalsIgnoreCase("exit"))
            {
                return;
            }

            String story = readStory(filePath);

            System.out.println(story);
        }
    }
    public static String promptUserForStory()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Available Stories");
        System.out.println(" 1) GoldiLocks");
        System.out.println(" 2) Hansel and Gretel");
        System.out.println(" 3) Mary had a little Lamb");
        System.out.println(" 4) Exit");
        System.out.println("Enter a choice: ");
        int choice = userInput.nextInt();

        switch (choice)
        {
            case 1:
                return "Files/goldilocks.txt";
            case 2:
                return "Files/hansel_and_gretel.txt";
            case 3:
                return "Files/mary_had_a_little_lamb.txt";
            default:
                return "exit";


        }

    }

    public static String readStory(String fileName)
    {
        File file = new File(fileName);
        StringBuilder builder = new StringBuilder();

        try
        {
            FileInputStream fileStream = new FileInputStream(file);
            Scanner fileScanner = new Scanner(fileStream);

            while(fileScanner.hasNextLine()){
               String line = fileScanner.nextLine();
               builder.append(line).append ("\n");
            }


        }
        catch(FileNotFoundException ex)
        {

        }

        return builder.toString();
    }
}
