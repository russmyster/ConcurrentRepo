
// program begins here
package csc120.classNotes.week0.jan25;

/*
Title: Day 1 Exercise

Description: Understanding a simple Java program

@author Russell S.
 */

// class definition
public class myprogram // class header
{ // start of outer code block (NOTHING ELSE GOES HERE EXCEPT MAIN METHOD)
    public static void main(String[] args) // main method header (ONLY ONE MAIN METHOD)
    { // start of inner code block
        // variable declarations
        int x;
        int y;
        double z;

        // assignment and output statements
        x = 1 + 3 * 2;
        System.out.println("x is " + x);        // initial value of x                                                               (7)

        y = x + x; // x * 2                     // change in y due to storing a multiple of x                                       (14)
        System.out.println("y is " + y);

        y = y + 1;                              // change in y due to storing an operation done to the previous value of y          (15)
        System.out.println("y is now " + y);

        x = x - 5;                              // change in x due to storing an operation done to the previous value of x          (2)
        System.out.println("x is now " + x);   

        z = y / x;                              // determining the value of y / x AFTER storing their new values, remember, now, x != 7
        System.out.print("z is " + z);          // outputs a float                                                                  (7.0 WRONG)
        System.out.print("\n");               // testing sysout with only "\n," as an ode to C

        y = y / x;                              //                                                                                  (7)
        System.out.println("y is now " + y);    // outputs a float
    }

}