package csc120.projects.proj3;

/**
 * <p>Title: Project 3 - Generating random addition or subtraction questions</p>
 * 
 * <p>Description: Creates and displays questions 1 - 15</p>
 * 
 * @author Russell Sleeby
 */
public class ArrayProject3App {
    /**
     * Name: main method
     * 
     * @param args values to be sent to the method
     */
    public static void main(String[] args){
        // Creates an array object of "Question"'s, with a determined length of 15
        Question[] questions = new Question[15];

        // For loop generates (array elements, aka) questions 1 - 15, and displays them
        for (int i = 0; i < questions.length; i++){
        // Instantiates new questions as objects, numbered 1 - 15
        questions[i] = new Question(); // Each question 1 - 15 can be called and used!

        System.out.println("Question " + (i + 1) + ": "     // Question number display
                          + questions[i].toString() + " "   // Question display
                          + questions[i].determineAnswer());// Answer display
        }
    }
}