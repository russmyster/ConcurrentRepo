package csc120.zybooks.chapter2.abstraction;

import javax.swing.JFrame;

public class jframe{
    public static void main(String[] args){
      // Construct the JFrame object
      JFrame appFrame = new JFrame();

      // Set the frame's width (400) and height (250) in pixels
      appFrame.setSize(400,250);

      // Set the frame's title
      appFrame.setTitle("Appframe Template");

      // Set the program to exit when the user
      // closes the frame
      appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Make the frame visible to the user
      appFrame.setVisible(true);
    }
}