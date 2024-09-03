package personal.homebrew.RandPlayerOrder;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class RandPlayerOrderv3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Scanner scnr2 = new Scanner(System.in); // Create a new scanner for the second input
    
        System.out.print("Enter the number of players in the match: ");
        int numPlayers = scnr.nextInt();
        scnr.nextLine(); // Consume newline
    
        String[] playerNamesInOrder;
        // Prompt the user after the second scanner is instantiated
        System.out.println("Do you want to keep the player names from last time? (yes/no): ");
        String keepNames = scnr2.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity
    
        // Check if the user wants to keep the previous names
        if (keepNames.equals("yes")) {
            // Load player names from file
            playerNamesInOrder = loadPlayerNamesFromFile(numPlayers);
        } else {
            // Get player names from user
            playerNamesInOrder = new String[numPlayers];
            for (int i = 0; i < numPlayers; i++) {
                System.out.print("Enter name for player " + (i + 1) + ": ");
                playerNamesInOrder[i] = scnr.nextLine();
            }
        }
        scnr.close(); // Close the first scanner
        scnr2.close(); // Close the second scanner

        // Generate player order
        int[] orderPlayers = OrderGenerator.generateOrder(numPlayers);

        // Save player names to file for future use
        savePlayerNamesToFile(playerNamesInOrder);

        // Prints the order of Players and their corresponding names
        System.out.println("\nOrdered Names: ");
        for (int i = 0; i < orderPlayers.length; i++) {
            int playerIndex = orderPlayers[i];
            System.out.print(playerIndex + 1 + ": " + playerNamesInOrder[playerIndex]);
            if (i < orderPlayers.length - 1) {
                System.out.print(", \n");
            }
        }

        // Prints the orderPlayers array's elements
        System.out.println("\nOrder of Players: ");
        for (int i = 0; i < orderPlayers.length; i++) {
            System.out.print((orderPlayers[i]) + 1);
            if (i < (orderPlayers.length - 1)) {
                System.out.print(", ");
            }
        }
    }

    private static String[] loadPlayerNamesFromFile(int numPlayers) {
        String[] playerNames = new String[numPlayers];
        try (BufferedReader br = new BufferedReader(new FileReader("player_names.txt"))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null && i < numPlayers) {
                playerNames[i] = line;
                i++;
            }
            System.out.println("Player names loaded from file.");
        } catch (IOException e) {
            System.err.println("Error reading player names from file: " + e.getMessage());
        }
        return playerNames;
    }

    private static void savePlayerNamesToFile(String[] playerNames) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("player_names.txt"))) {
            for (String name : playerNames) {
                writer.println(name);
            }
            System.out.println("Player names saved to file.");
        } catch (IOException e) {
            System.err.println("Error saving player names to file: " + e.getMessage());
        }
    }
}

class OrderGenerator {
    public static int[] generateOrder(int numPlayers) {
        Random randGen = new Random();
        int[] orderPlayers = new int[numPlayers];
        boolean[] used = new boolean[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            int rand;
            do {
                rand = randGen.nextInt(numPlayers);
            } while (used[rand]);
            orderPlayers[i] = rand;
            used[rand] = true;
        }
        return orderPlayers;
    }
}