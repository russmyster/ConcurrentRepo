package csc120.zybooks.chapter1.abstraction;

import java.util.Scanner;

public class lab17rightarrowv1 {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        //my work
        System.out.print("Pick a 1-sized letter or number for the base of the arrow: ");
        char baseChar = scnr.next().charAt(0); 
        System.out.print("Pick a 1-sized letter or number for the head of the arrow: ");
        char headChar = scnr.next().charAt(0);  
        System.out.print("\n");
            
        int h;
        int j;

        for (h = 0; h < 2; h++)
        {
            for (j = 0; j < 5; j++){
                System.out.print(" ");
            }
            if (h == 1){
                for (j = 0; j < 2; j++){
                    System.out.print(headChar);
                }
                System.out.print("\n");
            }
            
            else{
                for (j = 0; j < 1; j++){
                    System.out.print(headChar);
                }
                System.out.print("\n");
            }
        }



        for (h = 0; h < 3; h++){
            for (j = 0; j < 5; j++){
            System.out.print(baseChar);
            }
            char middle = headChar;
            if (h == 1){
                for (j = 0; j < 4; j++){
                    System.out.print(middle);
                }
                System.out.print("\n");
            }
            
            else{
                for (j = 0; j < 3; j++){
                    System.out.print(middle);
                }
                System.out.print("\n");
            }
        }


        for (h = 0; h < 2; h++){
            for (j = 0; j < 5; j++){
            System.out.print(" ");
            }
            
            if (h == 1){
                for (j = 0; j < 1; j++){
                    System.out.print(headChar);
                }
                System.out.print("\n");
            }
            
            else{
                for (j = 0; j < 2; j++){
                    System.out.print(headChar);
                }
                System.out.print("\n");
            }
        }
   }
}
