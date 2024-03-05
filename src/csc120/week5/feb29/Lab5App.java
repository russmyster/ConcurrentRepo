package csc120.week5.feb29;

/**
 * <p>Title: Lab5App.java</p>
 * <p>Description: Create dice.</p>
 * @author Russell Sleeby
 */
 
 public class Lab5App {
    public static void main( String args[] ) {
        // Your code here
        Dice dice = new Dice();

        System.out.println( "After instantiation: " + dice.toString() );

        System.out.println( "Value of die 1: " + dice.getDie1() );

        dice.roll();
        System.out.println( "After rolling: " + dice.toString() );
    }
}