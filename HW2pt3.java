
/**
 * Vincent Yin
 * 8/13/22
 * 2.3 Homework
 * Demonstrating math using user input
 * Variables:
 * x - First number the user inputs
 * y - Second number the user inputs
 */

import java.util.Scanner;

import java.text.DecimalFormat;

import java.lang.Math;

public class HW2pt3
{
    // Perform various mathematical tasks with two numbers
    public static void main (String[] args)
    {
        double x, y; 
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter a value for x:");
        x = scan.nextDouble();
        
        System.out.print ("Enter a value for y:");
        y = scan.nextDouble();
        
        // Use two numbers to perform various mathematical tasks
        
        DecimalFormat fmt = new DecimalFormat("0.###");
        //Restricts to three decimal places
        
        System.out.println ("Sum:" + fmt.format(x + y));
        System.out.println ("Difference of y from x:" + fmt.format(x - y));
        System.out.println ("Difference of x from y:" + fmt.format(y - x));
        System.out.println ("Product:" + fmt.format(x * y));
        System.out.println ("Quotient:" + fmt.format(x / y));
        System.out.println ("Remainder:" + fmt.format(x % y));
        System.out.println ("x to the power of y:" + fmt.format(Math.pow(x, y)));
        
        
        
    }
}