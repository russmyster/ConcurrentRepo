package csc120.projects.proj5;

import java.util.Scanner;

public class Project5App {
    private GUI gui;
    private DiceArray diceArray;
    private int[] scorecard = new int[6];  // scorecard for numbers 1 to 6

    public Project5App() {
        gui = new GUI();  // GUI initialization
        diceArray = new DiceArray(5);  // Initialize DiceArray with 5 dice
        for (int i = 0; i < scorecard.length; i++) {
            scorecard[i] = -1;  // Initialize scorecard entries to -1 (not scored yet)
        }
    }

    public void playRound() {
        Scanner scanner = new Scanner(System.in);
        int rollCount = 0;
        int[] keepIndices = new int[5];  // Array to store indices of dice to keep

        while (rollCount < 3) {
            diceArray.roll();
            gui.showDice(diceArray);  // Display the current dice values using GUI
            if (rollCount < 2) {  // Only process keeping dice if not the last roll
                System.out.println("Enter the indices of dice to keep (0-4), no spaces:");
                String input = scanner.nextLine();
                int numKept = 0;  // Counter for how many dice to keep

                // Process each character in the input as a potential dice index
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (Character.isDigit(c) && c >= '0' && c < '5') {
                        int index = c - '0';
                        if (index < 5) {
                            keepIndices[numKept++] = index;
                        }
                    }
                }

                // Copy the valid indices to a new array for the keep method
                int[] finalKeepIndices = new int[numKept];
                for (int i = 0; i < numKept; i++) {
                    finalKeepIndices[i] = keepIndices[i];
                }
                diceArray.keep(finalKeepIndices);
            }
            rollCount++;
        }

        System.out.println("Final dice roll:");
        gui.showDice(diceArray);  // Display the final dice roll
        int scoreIndex;
        do {
            System.out.println("Where would you like to record this score (1-6)? ");
            scoreIndex = scanner.nextInt() - 1;  // Convert user input to 0-based index
            scanner.nextLine();  // Consume newline character
            if (scoreIndex >= 0 && scoreIndex < 6 && scorecard[scoreIndex] != -1) {
                System.out.println("Score for " + (scoreIndex + 1) + " is already recorded. Please choose another location.");
            }
        } while (scoreIndex < 0 || scoreIndex >= 6 || scorecard[scoreIndex] != -1);

        scorecard[scoreIndex] = diceArray.calculateTotal(scoreIndex + 1);
        displayScorecard();
        scanner.close();
    }

    private void displayScorecard() {
        System.out.println("Current Scorecard:");
        for (int i = 0; i < scorecard.length; i++) {
            System.out.println((i + 1) + "s: " + (scorecard[i] == -1 ? 0 : scorecard[i]) + " points");
        }
    }

    public static void main(String[] args) {
        Project5App app = new Project5App();
        app.playRound();
    }
}