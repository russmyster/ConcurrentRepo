package csc120.zybooks.chapter1;

import java.util.Scanner;

public class lab17rightarrow {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        //my work
        int baseChar = scnr.nextInt(); 
        int headChar = scnr.nextInt(); 
            
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
            
            if (h == 1){
                for (j = 0; j < 4; j++){
                    System.out.print(headChar);
                }
                System.out.print("\n");
            }
            
            else{
                for (j = 0; j < 3; j++){
                    System.out.print(headChar);
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
