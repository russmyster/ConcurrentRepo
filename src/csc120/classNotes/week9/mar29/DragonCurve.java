package csc120.classNotes.week9.mar29;

public class DragonCurve {
    public static void main(String[] args){
        // turn (2n) = turn (n)
        // turn (2n+1) = (-1)^n

        int num = 0; // i want to know what is turn of 1

        while ( ++num < 100 ){
            int temp = num;

            while ( temp % 2 == 0 ) temp /= 2; // while even, /2 and storestore
            System.out.print( temp % 4 );
            //System.out.println( "num =" + num + "; temp = " + temp);

            // System.out.print( ( (temp - 1) / 2) % 2 );

            /*
            while ( temp % 2 == 0 ) temp /= 2;
            temp -= 1;
            temp /= 2;
            System.out.print( temp % 2 );
            */

            /*
            if ( temp % 4 == 1 )
                System.out.print( "L" );
            else
                System.out.print( "R" );
            */
        }
    }
}
