package csc120.projects.proj2;

import cardgames.*;

public class test {
    public static void main(String[] args){
        Deck theDeck = new Deck();
        theDeck.shuffleDeck();
        Card theCard = theDeck.dealCard();
        Card theCard2 = theDeck.dealCard();

        if(theCard.getValue() == 1){
            System.out.println("Is an Ace");
        } else {
            System.out.println("Is not an ace");
        }

        if(theCard.getSuit().equals("hearts")){
            System.out.println("Is a heart");
            theCard = theDeck.dealCard();
        } else {
            System.out.println("Is not a heart");
        }

        if(theCard2.getValue() > 10){
            //tbd
            System.out.println("Is a Face Card");
        } else {
            System.out.println("Is not a Face Card");
            theCard = theDeck.dealCard();
        }

    }
}
