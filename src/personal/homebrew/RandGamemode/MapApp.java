package personal.homebrew.RandGamemode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MapApp{
    public static void main(String[] args){
        RandMaps randMap = new RandMaps();
        Scanner scnr = new Scanner(System.in);

        String randDeathmatchMap = randMap.randDeathmatch(1);
        System.out.println(randDeathmatchMap);

        
    }
}

/*
    //TBD
    public String randDeathmatch() { // method for returning one map randomly from deathmatchMaps array
        int randomIndex = rand.nextInt(deathmatchMaps.length); // Generate a random index
        return deathmatchMaps[randomIndex];                    // Return the map at the random index
    }
*/

