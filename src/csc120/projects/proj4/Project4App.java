//package proj3;
package csc120.projects.proj4;
import csc120.projects.proj3.Question;
import java.util.Scanner;

/**
 * <p>Title: Project 4 - Generating random addition or subtraction questions</p>
 * 
 * <p>Description: Creates and displays a maximum of 20 questions.
 * If 10 questions are answered correctly before the 20 question limit, stops generating questions.
 * The number of questions answered correctly or incorrectly, and whether those answers were for
 * addition or subtraction questions are tracked appropriately.
 * If either condition was met, prints a student progress report.
 * Progress report details the total # of correct and incorrect answers to addition or subtraction questions,
 * along with the percentage of correct answers to the total number of questions answered by the student.</p>
 * 
 * @author Russell Sleeby
 */
public class Project4App {
    /**
     * Name: main method
     * 
     * @param args values to be sent to the method.
     */
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        // Variables to track correct, incorrect, and total answers for addition and subtraction problems.
        int numAdditionCorrectAns = 0;
        int numAdditionIncorrectAns = 0;
        int numSubtractionCorrectAns = 0;
        int numSubtractionIncorrectAns = 0;

        // Variables used for "loop-maintanence" (to ensure termination when it is appropriate)
        int totalCorrectAnswers = 0; // for-loop variable restriction is instantiated here..
        int totalQuestionsAnswered = 0;
        double percentCorrectAnswers = 0.0;

        // Break for-loop after checking that number of answered questions has reached 20
        for (; totalQuestionsAnswered < 20;){
            // Instantiate new Question object, display randomly generated question prompt to user
            Question question = new Question();
            System.out.println("What is the result?\n" + question.toString());
            int userAns = scnr.nextInt();
            // If '+', else '-' --> give response for user answer and increment the appropriate tracker.
            if( question.getOperator() == '+' ){
                if( userAns == question.determineAnswer() ){
                    System.out.println( "Congratulations, you got it correct!" );
                    numAdditionCorrectAns++;
                } else{
                    System.out.println( "The correct answer for " + question.toString() 
                                      + " is " + question.determineAnswer() );
                    numAdditionIncorrectAns++;
                }
            } else{
                if( userAns == question.determineAnswer() ){
                    System.out.println( "Congratulations, you got it correct!" );
                    numSubtractionCorrectAns++;
                } else{
                    System.out.println( "The correct answer for " + question.toString() 
                                      + " is " + question.determineAnswer() );
                    numSubtractionIncorrectAns++;
                }
            }

            // Update total correct answers, and number of questions answered to "enable" for-loop restrictions.
            totalCorrectAnswers = ( numAdditionCorrectAns + numSubtractionCorrectAns );
            totalQuestionsAnswered = ( totalCorrectAnswers 
                                     + numAdditionIncorrectAns + numSubtractionIncorrectAns );
            // Updates percentage of correct answers to the total # of questions answered.
            percentCorrectAnswers = ( (double) totalCorrectAnswers
                                    / (double) totalQuestionsAnswered ) * 100;

            // Break for-loop if total answered questions is at least 10, AND percent correct is at least 85%.
            if ( (totalQuestionsAnswered >= 10) && (percentCorrectAnswers >= 85.00) ){
                break;
            }
        }
        // Rounds percentage of correct answers to the total # of questions answered to nearest whole number.
        double roundedPercentCorrectAnswers = Math.round( percentCorrectAnswers );
        // Logic check to ensure division by 0 is caught as an exception and is displayed (very unlikely).
        if( totalQuestionsAnswered == 0) System.out.println("\nLOGIC ERROR DETECTED.\n" );

        // Prints out student progress report. 
        System.out.println( "\nProgress Report:" );
        // Displays correct and incorrect answers to addition and subtraction questions.
        System.out.println( "Addition:\n" + "You got " 
                          + numAdditionCorrectAns + " correct and " 
                          + numAdditionIncorrectAns + " incorrect." );
        System.out.println( "Subtraction:\n" + "You got "
                          + numSubtractionCorrectAns + " correct and "
                          + numSubtractionIncorrectAns + " incorrect." );
        // Displays the rounded percent of correct answers to the total # of questions answered.
        System.out.printf( "The percent correct is %.1f%%\n", roundedPercentCorrectAnswers );
    }
}