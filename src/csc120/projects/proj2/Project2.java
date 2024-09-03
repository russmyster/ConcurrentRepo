//package proj2;
package csc120.projects.proj2;
import cardgames.*;

/**
 * <p>Title: Project 2 - Manipulating the Card class</p>
 * 
 * <p>Description: This program begins by creating a new deck, shuffling the deck,
 * and assigning 3 random cards from it;
 * those assigned cards are shown via a pop-up called a graphical user interface.
 * It then proceeds to display the number "value" written on the card, along with 
 * what suit the card is a part of (also states whether the cards contain a pair or not).
 * Then, it displays the highest "value" between the three cards,
 * along with their point value summation;
 * if their point value summation is greater than or equal to 25 then
 * a player win message is displayed, otherwise a computer win message is displayed.
 * (note: any card past 10-- such as jack, queen, king-- will only be worth 10 points)</p>
 * 
 * @author Russell Sleeby
 */
public class Project2 {
    /**
     * <p>Name: main method</p>
     * 
     * @param args
     */
    public static void main(String[] args){
		GUI theWindow = new GUI();
		
		// Instantiates new Deck object, which gets shuffled
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();
		
		// Randomly deals cards from theDeck and displays them (in two ways)
		Card card1 = theDeck.dealCard();
		Card card2 = theDeck.dealCard();
		Card card3 = theDeck.dealCard();
		
		theWindow.showCard( card1 );
		theWindow.showCard( card2 );
		theWindow.showCard( card3 );
		
		System.out.println( "Card 1 is: " + card1.toString() );
		System.out.println( "Card 2 is: " + card2.toString() );
		System.out.println( "Card 3 is: " + card3.toString() );
		
		// Pair determination
		if( card1.getValue() == card2.getValue()
		 || card1.getValue() == card3.getValue()
		 || card2.getValue() == card3.getValue() ){
			System.out.println( "Pair" );
		} else{
			System.out.println( "Not a pair" );
		}

		// Highest card value determination
		int highestCardValue = card1.getValue();
		if( card2.getValue() > highestCardValue ){
			highestCardValue = card2.getValue();
		}
		if( card3.getValue() > highestCardValue ){
			highestCardValue = card3.getValue();
		}
		System.out.println( "The highest value is " + highestCardValue );

		// Point value summation of cards & win/loss prompt
		int sumCardPointValues = ( card1.getPointValue() 
								 + card2.getPointValue() 
								 + card3.getPointValue() );
		System.out.println( "The sum is " + sumCardPointValues );

		if( sumCardPointValues >= 25 ){
			System.out.println( "You win!" );
		} else {
			System.out.println( "Computer wins." );
		}
	}
}