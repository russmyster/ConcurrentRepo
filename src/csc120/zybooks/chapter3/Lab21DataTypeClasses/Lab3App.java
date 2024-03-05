package csc120.zybooks.chapter3.Lab21DataTypeClasses;

import cardgames.*;

public class Lab3App {
    public static void main(String[] args){
        //System.out.println(System.getProperty("java.class.path"));

        //Creates a var theDeck of type Deck
        Deck theDeck = new Deck();
        //Shuffles theDeck
        theDeck.shuffleDeck();
        //Stores dealCard's returned Card into cardOne, which is of type Card (which is of type int)
        Card cardOne = theDeck.dealCard();

        String cardOneString = cardOne.toString();
        System.out.println( cardOneString );

        int cardOneIntVal = cardOne.getValue();
        System.out.println( "The value of card1 is " + cardOneIntVal );

        int cardOnePointVal = cardOne.getPointValue();
        System.out.println( "The point value of card1 is " + cardOnePointVal );
    }
}
