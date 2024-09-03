package csc120.classNotes.week14.may2;

import java.util.Scanner;

public class Switcheroo {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        /*
        System.out.println("Enter a date in MM/DD/YYYY format: ");
        String date = scnr.nextLine();
        int month = Integer.parseInt( date.substring( 0, 2 ));
        // System.out.println( month );
        // System.out.println( month + 4);

        
        switch(month){
        case 1:
            System.out.println("It's cold");
            break;
        case 2:
            System.out.println("It's a Leap Year");
            break;
        case 3:
            System.out.println("Is winter over yet?");
            System.out.println("Is there even snow?");
            break;
        case 4:
            System.out.println("Tell Mother Nature it's almost May");
            break;
        default:
            System.out.println("Why is the airconditioner still on in the winter");
        } 
        */

        int choice = 2;
        switch(choice){
        case 1:
            System.out.println(1);
            break;
        case 2:
            System.out.println(2);
            // break;
        case 3:
            System.out.println(3);
            break;
        case 4:
            System.out.println(4);
            break;
        default:
            System.out.println(5);
            break;
        }
    }

}
