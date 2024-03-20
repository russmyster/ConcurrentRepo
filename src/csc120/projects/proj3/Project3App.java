package csc120.projects.proj3;
// package proj3;

/**
 * <p>Title: Project 3: Generating random addition or subtraction questions</p>
 * 
 * <p>Description: Creates and displays questions 1 - 15</p>
 * 
 * @author Russell Sleeby
 */
public class Project3App {
    /**
     * <p>Name: main method</p>
     * 
     * @param args
     */
    public static void main(String[] args){
        // Creates an array object of "Question"'s, with a determined length of 15
        Question[] questions = new Question[15];

        // For loop generates (array elements, aka) questions 1 - 15, and displays them
        for (int i = 0; i < questions.length; i++){
        questions[i] = new Question(); // Instantiates new questions as objects, numbered 1 - 15

        System.out.println("Question " + (i + 1) + ": "     // Question number display
                          + questions[i].toString() + " "   // Question display
                          + questions[i].determineAnswer());// Answer display
        }
    }
}