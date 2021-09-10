package com.mycompany.assignment_1;
public class Temperature
{
    double result = 0; // initializes variable for returning a result
    public double FahrenheitToCelsius(double numtoConvert) // method that converts Fahrenheit to Celsius
    {
            result = (numtoConvert - 32) * 5 / 9; // math that converts Fahrenheit to Celsius
            return result; // returns results
    }
    public double CelsiusToFahrenheit(double numtoConvert)
    {
            result = (numtoConvert * 9/5) + 32;
            return result;
    }
}
