package personal.homebrew.RandPlayerOrder;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>Title: RandPlayerOrderv2</p>
 * 
 * <p>Description: Prints out array of modulos (each value is +1 so we cannot get 0).</p>
 * 
 * @author Russell Sleeby
 */

public class RandPlayerOrderv2{
    /**
     * <p>Name: main method</p>
     * 
     * @param args
     */
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the number of players in the match: ");// Prompt user to enter numPlayers
        int numPlayers = scnr.nextInt();                                 // Stores numPlayers from user input
        scnr.nextLine(); // Consume newline

        // Generate player order
        int[] orderPlayers = OrderGenerator.generateOrder(numPlayers);

        // Store player names, in order that they were entered
        String[] playerNamesInOrder = new String[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            playerNamesInOrder[i] = scnr.nextLine();
        }
        scnr.close();                                                    // Closes scnr to free memory occupied by it
        
        // Prints the order of Players and their corresponding names
        System.out.println("\nOrder of Players and their Names: ");
        for (int i = 0; i < orderPlayers.length; i++) {
            int playerIndex = orderPlayers[i];
            System.out.print(/*playerIndex + 1 + ": " +*/ playerNamesInOrder[playerIndex]);
            if (i < orderPlayers.length - 1) {
                System.out.print(", \n");
            }
        }
        
        // Prints the orderPlayers array's elements
        System.out.println("\nOrder of Players: ");
        for (int i = 0; i < orderPlayers.length; i++){
            System.out.print( (orderPlayers[i]) + 1 );
            if (i < ( orderPlayers.length - 1 )){
                System.out.print(", ");
            }
        }
    }
}

/**
 * <p>Title: OrderGenerator</p>
 * 
 * <p>Description: Essentially generates a random player order for the specified number of players:<br>
 * 1) Generates random numbers, (default between 2^31 to (2^31) - 1) by the parameter maxNumber.<br>
 * 2) Takes random number and gets remainder of it after division by number of players in the match.<br>
 * 3) Fills an array, orderPlayers, with the modulos of the random numbers-- throwing out any repeats and regenerating them.</p>
 * 
 * @author Russell Sleeby
 */
class OrderGenerator{

/**
 * <p>Name: main method</p>
 * @param numPlayers The number of players in the match.
 * 
 * @return An integer array, representing the generated random player order, based off of non-repeated modulos.
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
        }
        return new int[numPlayers];
    }
}

class PlayerNameHandler{
    private String[] playerNames;

    public PlayerNameHandler(){
        // Initialize playerNames array to size >= max players
        playerNames = new String[20]; // Upper bound of max players
    }

/* potential conflict here */    public void setPlayerName(int playerIndex, String playerName){
        // Set the name for the player at the specified index
        playerNames[playerIndex] = playerName; // Assigns each playerName to a playerIndex as a part of array playerNames
    }

/* unused method call here */    public String getPlayerName(int playerIndex){
        // Get the name of the player at the index value being evaluated
        return playerNames[playerIndex];
    }
}