package csc120.classNotes.week12.apr18.ArrayFun;

public class Felix {
    private int[] array;

    public Felix(int size){
        array = new int[size];
        for(int i = 0; i < size; i++)
            array[ i ] = i;
    }

    public void shuffle(){ // returns nothing, takes nothing
        int current, temp;

        for( int size = array.length; size > 0 ; size--){
            current = (int) ( Math.random() * size );
            temp = array[ size - 1 ];
            array[ size - 1 ] = array[ current ];
            array[ current ] = temp;
        }
        
        /* 
        int i = array.length
        for( int i = size; i > 0 ; i--){
            current = (int) ( Math.random() * size );
            temp = array[ size ];
            array[ size ] = array[ current ];
            array[ current ] = temp;
        } 
        */
    }

    public String toString(){
        String s = "[";
        for(int i = 0; i < array.length - 1; i++)
            s += array[i] + ",";
        s += array[ array.length - 1 ] + "]";
        return s;
    }
}

