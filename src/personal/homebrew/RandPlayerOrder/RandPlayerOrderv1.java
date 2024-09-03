package personal.homebrew.RandPlayerOrder;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>Title: RandPlayerOrderv1<p>
 * 
 * <p>Description: Prints out array of modulos (each value is +1 so we cannot get 0).<p>
 * 
 * @author Russell Sleeby
 */

public class RandPlayerOrderv1{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the number of players in the match: ");// Prompt user to enter numPlayers
        int numPlayers = scnr.nextInt();                                 // Stores numPlayers from user input
        scnr.close();                                                    // Closes scnr to free memory occupied by it

        int[] orderPlayers = OrderGenerator.generateOrder(numPlayers);

        // Prints the orderPlayers array's elements
        System.out.println("Order of Players: ");
        for (int i = 0; i < orderPlayers.length; i++){
            System.out.print( (orderPlayers[i]) + 1 );
            if (i < ( orderPlayers.length - 1 )){
                System.out.print(", ");
            }
        }
    }
}

/**
 * <p>Title: OrderGenerator<p>
 * 
 * <p>Description: Essentially generates a random player order for the specified number of players:<br>
 * 1) Generates random numbers, (default between 2^31 to (2^31) - 1) by the parameter maxNumber.<br>
 * 2) Takes random number and gets remainder of it after division by number of players in the match.<br>
 * 3) Fills an array, orderPlayers, with the modulos of the random numbers-- throwing out any repeats and regenerating them.<p>
 * 
 * @author Russell Sleeby
 */
class OrderGenerator{

/**
 * @param numPlayers The number of players in the match.
 * @return An integer array, representing the determined random player order, according to non-repeated modulos.
 */
    public static int[] generateOrder(int numPlayers){
        Random randGen = new Random();
        int maxNumber = 2000000000;
        int[] orderPlayers = new int[numPlayers];

        for(int i = 0; i < numPlayers; i++){
            int randGenTemp = randGen.nextInt(maxNumber) + 1; // Ensures randGen num isn't 0
            int randModulo = randGenTemp % numPlayers;

            boolean repeatedModulo = false;
            for(int j = 0; j < i; j++){
                if(orderPlayers[j] == randModulo){
                    repeatedModulo = true;
                    break;
                }
            }

            // If modulo is repeated, regenerate it
            if(repeatedModulo){
                i--; // Decrement i to repeat the loop (since we have to generate a new modulo)
            } else{
                orderPlayers[i] = randModulo; // Stores modulo in orderPlayers array
            }

            // Ignore (for test purposes):
            //System.out.printf( "%d", randModulo);
            //System.out.println(", " + randGenTemp);

        }
        return orderPlayers;
    }
}