package csc120.zybooks.chapter3.chapterExamples;

import java.util.Scanner;

public class DataManipulationToShowOverflow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        long num1 = scnr.nextLong();
        long num2 = scnr.nextLong();
        long num3 = scnr.nextLong();
        long num4 = scnr.nextLong();
        scnr.close();
        
        long productNums = ( num1 * num2 * num3 * num4 );
        double avgNums = ( double ) ( num1 + num2 + num3 + num4 ) / 4;
        System.out.println( ( int ) productNums + " " + ( int ) avgNums );
        System.out.printf( "%.3f" + " %.3f\n", ( double ) productNums, avgNums );
   }
}
