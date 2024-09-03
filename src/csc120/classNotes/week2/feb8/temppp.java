package csc120.classNotes.week2.feb8;

import java.util.Scanner;

public class temppp{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        // type of object Scanner is "new"
        String temp = new String("Test nsfjanja");
        String temp2 = scnr.next();
        temp2 = temp;
        System.out.println(temp2);
    }
}