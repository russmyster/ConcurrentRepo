package csc120.classNotes.week14.may2;

public class RecursiveDragonCurve {
    /*
    public static void main(String[] args){
        int iter = 3;
        int[] dc = new int[ (int) ( Math.pow(2, iter) - 1) ];
        System.out.println( "size = " + dc.length);
        
        String[] dragonCurve;
        for( int i = (dc.length - 1); i > 0; i-- ){

        }
        for( int i = 0; i < (dc.length - 1); i++ ){

        }
    }
    */

    public static void main(String[] args){
        int iter = 3;
        int size = (int) ( Math.pow(2, iter) - 1);

        boolean[] dc = new boolean[ size ];
        
        int place = 0;
        for( int i = 0; i < iter; i++){
            dc[ place ] = true;
            for (int j = 0; j < place ; j++ ){
                dc[ place + j ] = !dc[ place - j ]; // can be used since it's boolean
            } 
            place = 2 * place + 1;
        }

        for( int i = 0; i < dc.length; i++){
            System.out.println(dc[i]);
        }
    }
}
