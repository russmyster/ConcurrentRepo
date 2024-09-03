package personal.practice;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        boolean a = scnr.nextBoolean();
        boolean b = scnr.nextBoolean();
        boolean isTrue;
        boolean isFalse;

        if( ((a && b) == true) || ((a || b) == false) ){ // same as saying (a == b)
            isTrue = true;
            isFalse = false;
        } else{
            isTrue = false;
            isFalse = true;
        }

        System.out.println("Value of isTrue is: " + isTrue + "\nValue of isFalse is: " + isFalse);
    }

    
}
