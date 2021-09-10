package com.mycompany.assignment_1;
public class Distance // same as Temperature class
{
    double result = 0;
    public double MilesToKilometers(double numtoConvert)
    {
            result = numtoConvert * 1.609;
            return result;   
    }
    public double KilometersToMiles(double numtoConvert)
    {
            result = numtoConvert / 1.609;
            return result;
    }
}
