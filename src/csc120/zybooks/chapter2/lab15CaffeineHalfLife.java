package csc120.zybooks.chapter2;

import java.util.Scanner;

public class lab15CaffeineHalfLife{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75. 

        System.out.println("Caffeine (mg): ");
        caffeineMg = scnr.nextDouble();

        double sixHours = (caffeineMg / 2 );
        System.out.printf("After 6 hours: %.2f mg\n", sixHours);

        double twelveHours = (sixHours / 2 );
        System.out.printf("After 12 hours: %.2f mg\n", twelveHours);

        double twentyFourHours = (twelveHours / (2 * 2) );
        System.out.printf("After 24 hours: %.2f mg\n", twentyFourHours);
    }
}