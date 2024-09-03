package csc120.classNotes.week12.apr18.ArrayFun;

public class ArrayFunDriver {
    public static void main(String[] args){
        Felix theCat = new Felix( 2 );
        System.out.println( theCat );
        //int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        theCat.shuffle();
        System.out.println(theCat);
    }
}
