package csc120.classNotes.week1.jan30;

import java.util.Scanner;

public class LabProgram
{
    public static void main(String[] args) 
    {
    Scanner scnr = new Scanner(System.in);
      
    double a;
    double w;
    double hr;
    double t;

    System.out.print("Age: ");
    a = scnr.nextDouble();
    System.out.print("Weight: ");
    w = scnr.nextDouble();
    System.out.print("Heart Rate: ");
    hr = scnr.nextDouble();
    System.out.print("Time (s): ");
    t = scnr.nextDouble();


    double cal = (  (  (a * 0.2757) + (w * 0.03295) + ((hr * 1.0781) - 75.4991)   )  * t) / 8.368;
    System.out.printf("Calories: %.2f calories\n", cal);

    scnr.close();
   }

   /*
   static double errorCatchingDouble(String[] args)
   {
    // I need to create a way to catch and have user reinsert data values if they give me anything that is not a number
    // I need to create a function, errorCatchingInt, that will help me check each "letter" of an input. I don't know how to do this in java yet..
    

    }
    */

} 
