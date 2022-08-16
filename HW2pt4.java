
/**
 * Vincent Yin
 * 8/13/22
 * 2.4 Homework
 * Temperature Converter
 * Variables:
 * fahr - The temperature in Fahrenheit, inputted by the user
 */

import java.util.Scanner;

import java.text.DecimalFormat;

public class HW2pt4
{
    public static void main (String[] args)
    {
        double fahr;
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Fahrenheit Temperature:");
        fahr = scan.nextDouble();
        
        double cels = (fahr - 32.0) * 5.0 / 9.0;
        
        DecimalFormat fmt = new DecimalFormat  ("0.###");
        
        System.out.println ("Celsius Equivalent:" + fmt.format(cels));
    
        }
}
