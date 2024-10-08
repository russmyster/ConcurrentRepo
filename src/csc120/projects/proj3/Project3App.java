//package proj3;
package csc120.projects.proj3;

/**
 * <p>Title: Project 3 - Generating random addition or subtraction questions</p>
 * 
 * <p>Description: Creates and displays questions 1 - 15.</p>
 * 
 * @author Russell Sleeby
 */
public class Project3App {
    /**
     * Name: main method
     * 
     * @param args values to be sent to the method
     */
    public static void main(String[] args){
        // For loop generates (question objects, aka) questions 1 - 15, and displays them
        for (int i = 0; i < 15; i++){
            Question question = new Question();             // Question object instantiation
            System.out.println("Question " + (i + 1) + ": " // Question number display
                        + question.toString() + " "         // Question display
                        + question.determineAnswer());      // Answer display
        }
    }
}