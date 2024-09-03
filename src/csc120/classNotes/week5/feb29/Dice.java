package csc120.classNotes.week5.feb29;

import java.util.Math;

/**
 * Represents a set of three dice
 * @author Russell Sleeby
 */
// this is the data-type class, where your instance variables go
public class Dice {
    // Enter your code here
    private int die1;
    private int die2;
    private int die3;

    /**
     * Constructor: Creates a default dice
     */
    public Dice(){ //default constructor
        die1 = 0;
        die2 = 0;
        die3 = 0;
    }

    /**
     * getDie: Returns the value of dice 1
     * @return returns the roll value of dice 1
     */
    public int getDie1(){ // returns an int
        return die1;
    }
    
    /**
     * getDie: Returns the value of dice 2
     * @return returns the roll value of dice 2
     */
    public int getDie2(){ // returns an int
        return die2;
    }
    
    /**
     * getDie: Returns the value of dice 3
     * @return returns the roll value of dice 3
     */
    public int getDie3(){ // returns an int
        return die3;
    }
    
   /**
    * calcTotalRoll
    * This method will calculate the sum of the values rolled
    * on the three dice
    * @return the sum of the three dice
    */
    public int calcTotalRoll(){
       return die1 + die2 + die3;
    }
    
   /**
    * threeOfAKind method
    * this method will determine if all three of the dice
    * have the same value
    * @return true if they have the same value, false otherwise
    */
    public boolean threeOfAKind(){
       return ( (die1 == die2) && (die2 == die3) );
    }
    
   /**
    * findHighestDie
    * This method will determine the highest value on the
    * three dice
    * @return the highest value
    */
    
    public int findHighestDie(){
       int highestDieValue = die1;
       
       if( die2 > highestDieValue) highestDieValue = die2;
       if( die3 > highestDieValue) highestDieValue = die3;
       
       return highestDieValue;
    }


    /**
     * toString: Returns the state of the dice
     * @return returns the face value of the dice
     */
    public String toString(){
      return "" + die1 + " " + die2 + " " + die3;
    }

    /**
     * roll: Rolls the dice
     */
    public void roll(){
        die1 = ( int ) ( Math.random() * 6 + 1 );
        die2 = ( int ) ( Math.random() * 6 + 1 );
        die3 = ( int ) ( Math.random() * 6 + 1 );
    }
    
    
   /**
    * rollOneDie: Rolls one die
    */
    public void rollOneDie(int numDieSelection){
       if (numDieSelection == 1) die1 = ( int ) ( Math.random() * 6 + 1 );
       if (numDieSelection == 2) die2 = ( int ) ( Math.random() * 6 + 1 );
       if (numDieSelection == 3) die3 = ( int ) ( Math.random() * 6 + 1 );
    }
 }