package csc120.projects.proj1;
import java.util.Scanner;

/**
* <p>Title: Project1</p>
*
* <p>Description: Program stores full name according to user input,
creating substrings without the inclusion of the space character.
It proceeds to give the number of chars in the first name, last name, and the full name.
Also, based on user input for midterm and final exam grades, it outputs the calculated average exam grade.<p>
*
* @author Russell Sleeby
*/

public class Project1{
    public static void main(String[] args){
        // Scnr variable created
        Scanner scnr = new Scanner(System.in);

        // Get + store full name, w/ user prompt
        System.out.print("Please enter your first name, followed by a space, followed by your last name: ");
        String fullName = scnr.nextLine();

        // Get + store midterm exam grade, w/ user prompt
        System.out.print("Please enter your midterm grade: ");
        int midtermExamGrade = scnr.nextInt();

        // Get + store final exam grade, w/ user prompt
        System.out.print("Please enter your final exam grade: ");
        int finalExamGrade = scnr.nextInt();

        // Calc + store exam average
        double avgExamGrade = ( ( (double) midtermExamGrade + (double) finalExamGrade) / 2 );

        // Substring creation of first & last names, w/o incl. space char
        String firstName = fullName.substring( 0, (fullName.indexOf(" ")) );
        String lastName = fullName.substring( ( (fullName.indexOf(" ")) + 1) );

        // Calc + store (w/o incl. space char)
        int numCharsFirstName = firstName.length();                     // # of chars in first name
        int numCharsLastName = lastName.length();                       // # of chars in last name
        int numCharsFullName = numCharsFirstName + numCharsLastName;    // # of chars in full name

        // Store initial of first name & last name
        char firstNameInitial = firstName.charAt(0);
        char lastNameInitial = lastName.charAt(0);

        // Close scanner to prevent resource leak from occuring
        scnr.close();

        // Output reverse fullName, w/o incl. space char, w/ description
        System.out.println("\n" + "Name: " + lastName + ", " + firstName);

        // Output the # of chars in first name, last name, and full name, w/o incl. space char, w/ description
        System.out.println("\n" + "There are " + numCharsFirstName + " letters in your first name");
        System.out.println("There are " + numCharsLastName + " letters in your last name");
        System.out.println("There are " + numCharsFullName + " letters in your full name");

        // Output initials of first name and last name, w/ description
        System.out.println("\nYour initials are " + firstNameInitial + " and " + lastNameInitial);

        // Output midterm exam grade, w/ description
        System.out.println("\nYour midterm grade is " + midtermExamGrade);

        // Output final exam grade, w/ description
        System.out.println("Your final exam grade is " + finalExamGrade);

        // Output calc + stored average exam grade, w/ description
        System.out.println("\nYour exam average is " + avgExamGrade);
    }
} 