package com.mycompany.assignment_1;
public class Weight // same as Temperature class
{
    double result = 0;
    public double PoundsToKilograms(double numtoConvert)
    {
            result = numtoConvert / 2.205;
            return result;   
    }
    public double KilogramsToPounds(double numtoConvert)
    {
            result = numtoConvert * 2.205;
            return result;
    }
}
