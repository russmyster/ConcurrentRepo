package csc120.projects.proj6;

// Source code is decompiled from a .class file using FernFlower decompiler.

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class GUI {
   public static int callCounter;
   public static boolean[] tests = new boolean[5];
   private static int[][] cannedReturnValues = new int[][]{{2, 3}, {0, 0, 0, 1, 0, 1, 0, 0, 2, 3}, {0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 2, 3}, {0, 1, 0, 1, 0, 1, 1, 6, 2, 0, 1, 0, 1, 2, 3}, {1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 3, 1, 0, 1, 11, 3}};

   public GUI() {
   }

   public static void setTest(int testNum) {
      for(int i = 0; i < tests.length; ++i) {
         tests[i] = false;
      }

      tests[testNum] = true;
      callCounter = 0;
   }

   public static void showMessageDialog(String msg, String title) {
      System.out.println("***** " + title + " *****");
      System.out.println(msg + "\n");
      boolean inTest = false;

      for(int i = 0; i < tests.length; ++i) {
         if (tests[i]) {
            inTest = true;
         }
      }

      if (!inTest) {
         JOptionPane.showMessageDialog((Component)null, msg, title, 1);
      }

   }

   public static int showOptionDialog(String msg, String title, String[] choices) {
      String allChoices = "";

      int i;
      for(i = 0; i < choices.length; ++i) {
         allChoices = allChoices + choices[i];
         if (i < choices.length - 1) {
            allChoices = allChoices + " * ";
         }
      }

      System.out.println("***** " + title + " *****");
      System.out.println(msg + "\n" + allChoices + "\n");

      for(i = 0; i < tests.length; ++i) {
         if (tests[i]) {
            return cannedReturnValues[i][callCounter++];
         }
      }

      return JOptionPane.showOptionDialog((Component)null, msg, title, -1, 3, (Icon)null, choices, choices[0]);
   }

   public static String showInputDialog(String msg, String title) {
      System.out.println("***** " + title + " *****");
      System.out.println(msg);
      String ret = "";

      for(int i = 0; i < tests.length; ++i) {
         if (tests[i]) {
            return ret + cannedReturnValues[i][callCounter++];
         }
      }

      return JOptionPane.showInputDialog((Component)null, msg, title, 3);
   }
}
