//package proj3;
package csc120.projects.proj3;
import java.util.Random;

/**
 * <p>Title: Project 3 - Random addition and subtraction</p>
 * 
 * <p>Description: This program randomly selects operand's 1 and 2 based on
 * the randomly selected operator ( '+' or '-' ).
 * If the addition operator was selected, then operands 1 and 2 are between 0 and 12.
 * If the subtraction operator was selected, then operand 1 is between 6 and 12,
 * and operand 2 is less than or equal to the selected operand 1.
 * There are also methods that give the user the values of operands 1 and 2,
 * along with which operator was selected.
 * Moreover, there is a method, determineAnswer(), 
 * that determines and returns the integer answer to the randomly generated question.</p>
 * 
 * @author Russell Sleeby
 */
public class Question {
    private int operand1;
    private int operand2;
    private char operator;

    Random randGen = new Random();

    /**
     * Constructor: Randomly assigns values to instance variables based on
     * the randomly determined type of operator ( '+' or '-' ).
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
     * getOperand1: gets value of the random operand1
     * 
     * @return returns integer value of operand1
     */
    public int getOperand1(){
        return operand1;
    }

    /**
     * getOperand2: gets value of the random operand2
     * 
     * @return returns integer value of operand2
     */
    public int getOperand2(){
        return operand2;
    }

    /**
     * getOperator: gets character ( '+' or '-' ) of the random operator.
     * 
     * @return returns the character of the operator, either '+' or '-'.
     */
    public char getOperator(){
        return operator;
    }

    /**
     * toString method: gets randomized addition or subtraction question.
     * 
     * @return returns a string detailing the randomly generated question.
     */
    public String toString(){
        return operand1 + " " + operator + " " + operand2 + " =";
    }

    /**
     * determineAnswer method: gets answer to the randomized addition or subtraction question.
     * 
     * @return returns the integer value of the answer to the randomly generated question.
     */
    public int determineAnswer(){
        if (operator == '+') return operand1 + operand2;
        else return operand1 - operand2;
    }
}
