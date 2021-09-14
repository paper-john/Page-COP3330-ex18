package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class TempConversion
{
    public static void main( String[] args )
    {
        //declare variables
        double c, f, convertC, convertF;
        String choice;

        Scanner input = new Scanner(System.in);

        //Record user input choice
        System.out.print("Press C to convert from Fahrenheit to Celsius\n" + "Press F to convert from Celsius to Fahrenheit.\nEnter letter: ");
        choice = input.nextLine();

        choice = choice.toUpperCase(); //Accepts upper or lower case

        System.out.println("Your choice: " + choice);

        //display result
        if ((choice).equals("C"))
        {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            f = input.nextDouble();
            convertC = (f - 32) * 5 / 9;
            System.out.println("The temperature is "+String.format("%.0f", convertC));
        }
        else if((choice).equals("F"));
        {
            System.out.println("Please enter the temperature in Celsius: ");
            c = input.nextDouble();
            convertF = (c * 9 / 5) + 32;
            System.out.println("The temperature is "+String.format("%.0f", convertF));
        }
    }
}
