package csc120.week1.jan30.abstraction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class modifiedlabv1
{
    public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    
    // declaration now unncessary
    // double a,w,hr,t;

    // initialization of vars a,w,hr,t + prompt + user input is scanned for
    double a = getCheckDouble("Age: ", scnr);
    double w = getCheckDouble("Weight (lbs): ", scnr);
    double hr = getCheckDouble("Heart Rate (bpm): ", scnr);
    double t = getCheckDouble("Time (s): ", scnr);

    // initialization of cal to expression for caloric expenditure based on above vars
    double cal = (  (  (a * 0.2757) + (w * 0.03295) + ((hr * 1.0781) - 75.4991)   )  * t) / 8.368;
    System.out.printf("Calories: %.2f calories\n", cal);

    // close scanner utility
    scnr.close();
   }



                 // Method name        // Parameters: prompt & scnr
   static double getCheckDouble(String prompt, Scanner scnr){
    // I need to create a way to catch and have user reinsert data values if they give me anything that is not a number
    // I need to create a function, errorCatchingInt, that will help me check each "letter" of an input. I don't know how to do this in java yet..
    // ^^ NOW I DO! (sorta)
    
    double input = 0;
    boolean validInput = false;

    while (!validInput)
    {
        System.out.print(prompt);

        //try-catch block for exception handling
        try 
        {
            // this statement DOES NOT STOP scnr statement from taking mult. values in-line
            // input = scnr.nextDouble();
            // e.g. "49    155" would be taken in as both the input for Age and for Weight simultaneously
            
            String inputString = scnr.nextLine(); // stores next user input as a string
            String tempString = inputString;

            // this statement disallowed whitespaces, and I now deem that to be unnecessary
            /*if (inputString.contains(" "))
            {
                System.out.println("Please only enter one value at a time.");
            }*/

            // technically unnecessary, but I use it strictly for the output flair
            // catch nfe does this already + restricts . , / \ [ ] " " + / - * & ^ % # !, among other characters
            /*else */
            if (tempString.matches("[a-zA-Z+]")){
                System.out.println("Please do not enter letters, only use numbers.");
            }
            else{
                // this string -> double conversion must happen here
                // if it happens earlier, like next to decl of inputString,
                // then whitespace is converted into a double via the if-statement, causing a float error (DNE)
                    // ignore this, as it is unnecessary
                    // inputString.replaceAll("\\W", "");
                input = Double.parseDouble(inputString); 
                if (input > 0){
                    validInput = true;
                }
                else{
                    System.out.println("Please enter a positive value.");
                }
            }
        }
            
            catch (InputMismatchException e){
                System.out.println("Invalid input. Please retry entering a valid number.");
            }

            catch (NumberFormatException nfe){
                System.out.println("Invalid input. Please retry entering a valid number.");
            }
    }
    return input;


    }
    
} 


    /*
    System.out.print("Age: ");
    a = scnr.nextDouble();
    System.out.print("Weight: ");
    w = scnr.nextDouble();
    System.out.print("Heart Rate: ");
    hr = scnr.nextDouble();
    System.out.print("Time (s): ");
    t = scnr.nextDouble();
    */