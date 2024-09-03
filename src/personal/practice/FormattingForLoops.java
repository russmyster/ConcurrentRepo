package personal.practice;
import java.util.Scanner;

public class FormattingForLoops {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputCount;
        inputCount = scnr.nextInt();
        
        for ( int i = 0; i <= inputCount - 1; i++){
            int userInt = scnr.nextInt();
            System.out.print(userInt);
/*
* Note: An approach to avoid outputting ": " after the last value is to 
* use an if statement in the for loop that checks if the iterator i 
* is not equal to the last iteration, inputCount - 1.
*/
            if ( i != (inputCount - 1) ){
                System.out.print(": ");
            }
        } System.out.println();
    }
}


