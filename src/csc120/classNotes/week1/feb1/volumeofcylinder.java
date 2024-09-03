package csc120.classNotes.week1.feb1;

import java.util.Scanner;

public class volumeofcylinder{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        double r = scnr.nextDouble();
        double h = scnr.nextDouble();
        double pi = 3.14;

        double vol = ( pi * (r * r) * h);
        System.out.printf("Volume: %.3f", vol);

    }
}