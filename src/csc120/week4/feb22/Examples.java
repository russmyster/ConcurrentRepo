package csc120.week4.feb22;

import java.util.Scanner;

public class Examples ( int num ) {
    public static void main(String[] args){
    //TBD
    /* // Ex 1
    int num = 5;
    boolean y = true;

    if( num < 7 ) { System.out.println( "Hello" ); }
    if( !y ) { System.out.println( "It is not true" ); }
    else { System.out.println( "It is true" ); } */

    /* // Ex 2
    Scanner scnr = new Scanner(System.in);
    
    int num = scnr.nextInt();
    //String parity;
    System.out.print( num + " is an " );

    if ( num % 2 == 0 ){ System.out.print( "even " ); }
    else { System.out.print( "odd " ); }

    System.out.println( "number." ); */

    // Ex 3 
    /*
    int number = 15;
    if ( number > 20 ) System.out.println( "Great!" );
    else if ( number == 12 );
    System.out.println( "narf!" );
    */
    
    // Ex 4
    /*
    char letterGrade;
    int grade;

    Scanner scnr = new Scanner(System.in);
    grade = scnr.next().charAt(1);

    if ( grade >= 90 ) letterGrade = 'A';
    else if ( grade >= 80 ) { letterGrade = 'B'; }
    else if ( grade >= 70 ) { letterGrade = 'C'; }
    else if ( grade >= 60 ) { letterGrade = 'D'; }
    else { letterGrade = 'F'; }

    System.out.println( letterGrade );
    */


    // Ex 5
    ///*
    String str1 = "Kombucha";
    String str2 = "Kevita";
    String str3 = "Pancake";

    if ( str1 == str3 ) System.out.println("true");
    else System.out.println( "false" );
    //*/

    // Ex 6
    /*
    Dog a = new Dog( "Fido" );
    Dog b = new Dog( "Henry" );
    Dog c = new Dog( "Fabio" );
    Dog d = new Dog( "Fido" );

    System.out.println( a.dogName.equals( d.dogName ));
    */

    // Ex 7
    private int value;
    private String suit;

    value = num % 13;
    int suitNumber = num / 13;

    if(suitNumber == 0)
        suit = "Hearts";
    else if(suitNumber == 1)
        suit = "Diamonds"
    else if(suitNumber == 2)
        suit = "Clubs";
    else 
        suit = "Spades";

    }

    public String toString(){
        String type;

        if (value == 0)
            type = "King";
        else if (value == 1)
            type = "Jack"
        else if ()
    }
}
