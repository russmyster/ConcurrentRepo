package csc120.zybooks.chapter2;

import java.util.Scanner;

public class lab16DrivingCosts{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
      
        System.out.println("Car Mileage (miles / gallon): ");
        double milesPerGallon = scnr.nextDouble();
        
        System.out.println("Gas Price ($cost / gallon): ");
        double dollarsPerGallon = scnr.nextDouble();
        
        double dollarsPerMile = ( dollarsPerGallon / milesPerGallon );
        
        System.out.printf("Cost of 20 miles: %.2f" + "\n", (dollarsPerMile * 20) ); // can add newline w/ concatenation
        System.out.printf("Cost of 75 miles: %.2f\n", (dollarsPerMile * 75) ); // or simply by inserting newline
        System.out.printf("Cost of 500 miles: %.2f\n", (dollarsPerMile * 500) ); // after %.2f statement
    }
}