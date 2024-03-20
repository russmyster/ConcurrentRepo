package csc120.projects.proj3;
// package proj3;
import java.util.Random;

/**
 * <p>Title: Project 3 - Random addition and subtraction</p>
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
public class Question {
    private int operand1;
    private int operand2;
    private char operator;

    Random randGen = new Random();

    /**
     * <p>Constructor: Randomly assigns values to instance variables based on
     * the randomly determined type of operator ( '+' or '-' ).</p>
     */
    public Question(){
        if ( (randGen.nextInt() % 2) == 0 ) operator = '+';
        else operator = '-';

        if (operator == '+'){
            operand1 = (int) randGen.nextInt(13);
            operand2 = (int) randGen.nextInt(13);
        } else{
            operand1 = (int) randGen.nextInt(7) + 6;
            operand2 = (int) randGen.nextInt(operand1 + 1);
        }
    }

    /**
     * <p>getOperand1: gets value of the random operand1</p>
     * 
     * @return int
     */
    public int getOperand1(){
        return operand1;
    }

    /**
     * <p>getOperand2: gets value of the random operand2</p>
     * 
     * @return int
     */
    public int getOperand2(){
        return operand2;
    }

    /**
     * <p>getOperator: gets character ( '+' or '-' ) of the random operator</p>
     * 
     * @return char
     */
    public char getOperator(){
        return operator;
    }

    /**
     * <p>toString: gets randomized addition or subtraction question</p>
     * 
     * @return String
     */
    public String toString(){
        return operand1 + " " + operator + " " + operand2 + " =";
    }

    /**
     * <p>determineAnswer: gets answer to the randomized addition or subtraction question</p>
     * 
     * @return int
     */
    public int determineAnswer(){
        if (operator == '+') return operand1 + operand2;
        else return operand1 - operand2;
    }
}
