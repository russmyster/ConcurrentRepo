package csc120.classNotes.week9.mar29;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; ++i){
            System.out.print("Please enter an integer: ");
            arr[i] = scnr.nextInt();
        }
        for (int i = 0; i < 5; ++i)
            System.out.print("[" + arr[ i ] + "]");
    }
}
