package csc120.week5.feb29;

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
     * getDie: Returns the value of the dice
     * @return returns the roll value of the dice
     */
    public int getDie1(){ // returns an int
        return die1;
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
 }