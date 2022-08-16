
/**
 * Vincent Yin
 * 8/13/22
 * 2.7 Homework
 * Time Converter
 * Variables:
 * time - An amount of time, in seconds, inputted by the user
 */

import java.util.Scanner;

import java.text.DecimalFormat;

public class HW2pt7
{
    public static void main (String[] args)
    {
        int time;
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter Time in Seconds:");
        time = scan.nextInt();
        
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;
        
        System.out.println (hours + " Hours," + minutes + " Minutes," + seconds + " Seconds");
    }
}
