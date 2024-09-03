package csc120.classNotes.week2.feb8;

import java.util.*;

public class moduloBatchesOfFlowers{

    //static long batchesOfFlowers;
    public static void main(String[] args){
        long startTime = System.nanoTime();
        //moduloBatchesOfFlowers();

        long totalFlowers = 2158342234235262456l;
        long batchesOfFlowers;
        
        batchesOfFlowers = ( (totalFlowers - (totalFlowers % 12) ) / 12 );
        System.out.println(batchesOfFlowers);
        
        long estimatedElapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed execution time in ns: " + estimatedElapsedTime);
    }

    //public String moduloTest(String[] args){
    //    String temp = System.out.println("hihihihihi" + batchesOfFlowers);

    //}
}