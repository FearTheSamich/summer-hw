
/**
 * Vincent Yin
 * 8/13/22
 * 2.8 Homework
 * Distance Between Two Points
 * Variables:
 * x1 - The x-coordinate of the first point inputted by the user
 * y1 - The y-coordinate of the first point inputted by the user
 * x2 - The x-coordinate of the second point inputted by the user
 * y2 - The y-coordinate of the second point inputted by the user
 */

import java.util.Scanner;

import java.text.DecimalFormat;

public class HW2pt8
{
    public static void main (String[] args)
    {
        double x1, x2, y1, y2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter the x-value for point 1:");
        x1 = scan.nextDouble();
        
        System.out.print ("Enter the y-value for point 1:");
        y1 = scan.nextDouble();
        
        System.out.print ("Enter the x-value for point 2:");
        x2 = scan.nextDouble();
        
        System.out.print ("Enter the y-value for point 2:");
        y2 = scan.nextDouble();
        
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        
        System.out.print ("Distance between the two points:" + (distance));
    }
}
