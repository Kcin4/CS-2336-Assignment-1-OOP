/* 
Name: Nicholas Phan
NetID: ntp180002
Date Started: 9/7/2021
Class: 2336.005
Description/Purpose: This program allows the user to convert measurements of weight/distance/temperature to other units.
*/
package com.mycompany.assignment_1;

import java.util.*;
import java.text.DecimalFormat;

public class CS2336Asg1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // creating a scanner object for inputs
        Temperature tempConversion = new Temperature(); // instantiating all the conversion classes so that the methods within these classes can be used later
        Weight weightConversion = new Weight();
        Distance distanceConversion = new Distance();
        int menuSelect = 0; // the variable for menu selection
        DecimalFormat df = new DecimalFormat("#.##"); // decimal format class creation for 2 decimal places
        while (menuSelect != 7) // loop to allow the user to use the program as much as they want until they select "7"
        {
            System.out.println("Please select from one of the following menu options: "); // Menu options prompt
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Convert pounds to kilograms");
            System.out.println("4. Convert kilograms to pounds");
            System.out.println("5. Convert miles to kilometers");
            System.out.println("6. Convert kilometers to miles");
            System.out.println("7. Exit the program.");
            System.out.println("");
            System.out.println("Input your menu selection: ");
            menuSelect = input.nextInt(); // user inputs menu selection number here
            while (menuSelect < 1 || menuSelect > 7) // if the user inputs an invalid number, this will prompt them to reenter a valid one.
            {
                System.out.println("Invalid option.");
                System.out.println("Enter a valid menu option: ");
                menuSelect = input.nextInt();
            }
            if (menuSelect >= 1 && menuSelect < 7) // if the user has chosen not to exit the program
            {
                System.out.println("Number to be converted: "); // prompt the user for the number they would like to convert
                double convertNum = input.nextDouble(); // initialize the number to be passed to the class methods
                while (menuSelect >=3 && menuSelect <=6 && convertNum < 0) // if the number is negative and also a distance/weight, will prompt to reenter a valid number
                {
                    System.out.println("Cannot convert a negative number for weight/length.");   
                    System.out.println("Please enter a valid/positive number: ");
                    convertNum = input.nextDouble();
                }
                switch (menuSelect) // switch statement after selecting valid menu option
                {
                    case 1:
                        {
                            double unroundedResult = tempConversion.FahrenheitToCelsius(convertNum); // creates an unrounded result by passing the number to the class method and getting a return value
                            System.out.println("The result is " + df.format(unroundedResult) + " degrees Celsius!"); // outputs results with the decimal format to two decimal places
                            System.out.println("");
                            break;
                        }
                    case 2:
                        {
                            double unroundedResult = tempConversion.CelsiusToFahrenheit(convertNum);
                            System.out.println("The result is " + df.format(unroundedResult) + " degrees Fahrenheit!");
                            System.out.println("");
                            break;
                        }
                    case 3:
                        {
                            double unroundedResult = weightConversion.PoundsToKilograms(convertNum);
                            System.out.println("The result is " + df.format(unroundedResult) + " kilograms!");
                            System.out.println("");
                            break;
                        }
                    case 4:
                        {
                            double unroundedResult = weightConversion.KilogramsToPounds(convertNum);
                            System.out.println("The result is " + df.format(unroundedResult) + " pounds!");
                            System.out.println("");
                            break;
                        }
                    case 5:
                        {
                            double unroundedResult = distanceConversion.MilesToKilometers(convertNum);
                            System.out.println("The result is " + df.format(unroundedResult) + " kilometers!");
                            System.out.println("");
                            break;
                        }
                    case 6:
                        {
                            double unroundedResult = distanceConversion.KilometersToMiles(convertNum);
                            System.out.println("The result is " + df.format(unroundedResult) + " miles!");
                            System.out.println("");
                            break;
                        }
                    default:
                        break;
                }
            } 
            else if (menuSelect == 7) // if the user chooses options 7, exit the program
            {
                System.out.println("Thank you for using the program, goodbye!");
                System.exit(0);
            }
        }
    }
}
