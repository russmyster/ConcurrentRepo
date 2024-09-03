package personal.homebrew.RandPlayerOrder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

public class FinalRandPlayerOrder extends JFrame {
    private JTextField numPlayersField;
    private JTextArea outputArea;

    public FinalRandPlayerOrder() {
        setTitle("Random Player Order");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for input
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        JLabel numPlayersLabel = new JLabel("Enter the number of players in the match:");
        numPlayersField = new JTextField(10);
        inputPanel.add(numPlayersLabel);
        inputPanel.add(numPlayersField);

        // Panel for submit button
        JPanel buttonPanel = new JPanel();
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        buttonPanel.add(submitButton);

        // Panel for input and submit button
        JPanel inputSubmitPanel = new JPanel();
        inputSubmitPanel.setLayout(new BorderLayout());
        inputSubmitPanel.add(inputPanel, BorderLayout.CENTER);
        inputSubmitPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Panel for output
        JPanel outputPanel = new JPanel();
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        outputPanel.add(new JScrollPane(outputArea));

        // Add panels to the frame
        add(inputSubmitPanel, BorderLayout.NORTH);
        add(outputPanel, BorderLayout.CENTER);
    }

    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int numPlayers = Integer.parseInt(numPlayersField.getText());

            String[] playerNamesInOrder;
            String keepNames = showInputDialogWithValidation("Do you want to keep the player names from last time? (yes/no)");

            if (keepNames != null && keepNames.equalsIgnoreCase("no")) {
                playerNamesInOrder = new String[numPlayers];
                for (int i = 0; i < numPlayers; i++) {
                    String name = JOptionPane.showInputDialog("Enter name for player " + (i + 1));
                    playerNamesInOrder[i] = name;
                }
            } else {
                playerNamesInOrder = loadPlayerNamesFromFile(numPlayers);
            }

            int[] orderPlayers = OrderGenerator.generateOrder(numPlayers);
            savePlayerNamesToFile(playerNamesInOrder);

            StringBuilder output = new StringBuilder();
            output.append("Ordered Names:\n");
            for (int i = 0; i < orderPlayers.length; i++) {
                int playerIndex = orderPlayers[i];
                output.append(playerIndex + 1).append(": ").append(playerNamesInOrder[playerIndex]);
                if (i < orderPlayers.length - 1) {
                    output.append(", \n");
                }
            }

            output.append("\nOrder of Players:\n");
            for (int i = 0; i < orderPlayers.length; i++) {
                output.append(orderPlayers[i] + 1);
                if (i < orderPlayers.length - 1) {
                    output.append(", ");
                }
            }

            outputArea.setText(output.toString());
        }

        // Helper method for input validation
        private String showInputDialogWithValidation(String message) {
            String input;
            do {
                input = JOptionPane.showInputDialog(message);
                if (input != null && !input.isEmpty() && !input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")) {
                    JOptionPane.showMessageDialog(null, "Please enter 'yes' or 'no'.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (input != null && !input.isEmpty() && !input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));
            return input;
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
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading player names from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return playerNames;
    }

    private static void savePlayerNamesToFile(String[] playerNames) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("player_names.txt"))) {
            for (String name : playerNames) {
                writer.println(name);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving player names to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FinalRandPlayerOrder frame = new FinalRandPlayerOrder();
            frame.setVisible(true);
        });
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
