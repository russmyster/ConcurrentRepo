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

        System.out.println( "\nValue of die 1: " + dice.getDie1() );
        System.out.println( "Value of die 2: " + dice.getDie2() );
        System.out.println( "Value of die 3: " + dice.getDie3() );

        dice.roll();
        System.out.println( "\nAfter rolling the dice: " + dice.toString() );
        
        System.out.println("\nThe roll total is " + dice.calcTotalRoll());
        
        if (dice.threeOfAKind()) System.out.println("\nThree of a kind.");
        else System.out.println("\nNot three of a kind.");
        
        System.out.println("\nThe highest value of the three dice is " + dice.findHighestDie());
        
        dice.rollOneDie(1);
        System.out.println("\nRolling die 1 only: " + dice.toString());
        
        dice.rollOneDie(2);
        System.out.println("\nRolling die 2 only: " + dice.toString());
        
        dice.rollOneDie(3);
        System.out.println("\nRolling die 3 only: " + dice.toString());
    }
}