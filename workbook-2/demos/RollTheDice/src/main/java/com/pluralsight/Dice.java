package com.pluralsight;

public class Dice {
    public int roll()
    {
        int randomNum = (int)(Math.random() * 6) + 1;
        return randomNum;
    }
}
