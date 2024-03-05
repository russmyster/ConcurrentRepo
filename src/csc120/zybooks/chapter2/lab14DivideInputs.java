package csc120.zybooks.chapter2;

import java.util.Scanner;

public class lab14DivideInputs{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
      
        System.out.println("Enter a number that you want to divide: ");
        double userNum = scnr.nextDouble();
        
        System.out.println("Enter the number you want to divide by: ");
        double divNum = scnr.nextDouble();
        
        double userQuotient = ( userNum / divNum );
        System.out.printf("This is your resultant quotient: \n%.2f", userQuotient);
    }
}