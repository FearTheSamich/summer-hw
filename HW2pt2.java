
/**
 * Vincent Yin
 * 8/13/22
 * 2.2 Homework
 * Demonstrates calculation based on user input
 * Variables:
 * x - First number the user inputs, can be int or double
 * y - Second number the user inputs, can be int or double
 * z - Third number the user inputs, can be int or double
 */

import java.util.Scanner;

import java.text.DecimalFormat;

public class HW2pt2
{
    //---------------------------------------------------
    //Determines the average of three numbers
    //---------------------------------------------------
    public static void main (String[] args)
    {
            double x, y, z; // (x + y +z) / 3
            Scanner scan = new Scanner(System.in);
            
            System.out.print ("Enter the first number:");
            x = scan.nextDouble();
            
            System.out.print ("Enter the second number:");
            y = scan.nextDouble();
            
            System.out.print ("Enter the third number:");
            z = scan.nextDouble();
            
            // Add all three numbers, then divide by three
            
            double Average = (x + y + z) / 3;
            
            DecimalFormat fmt = new DecimalFormat("0.###");
            //Restricts to three decimal places
            
            System.out.println ("Average:" + fmt.format(Average));
    }
}
