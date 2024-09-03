package personal.homebrew.RandGamemode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Randomizes maps of different types
 * 
 * @author Russell Sleeby
 */
// this is the data-type class, where your instance variables go
public class RandMaps{
    // Internal data (private fields)
    private String[] deathmatchMaps;
    private String[] ctfMaps;
    private String[] conquestMaps; 
    private String[] destructionMap;

    Random rand = new Random();

    /**
     * Constructor: Creates default string arrays for all map types
     */
    public RandMaps(){ // constructs the maps' string arrays
        deathmatchMaps = new String [] { 
            "Abandoned Ruins Outskirts", 
            "Secret Portal Gathering", 
            "Bell's Sanctum", 
            "Frozen Kardia Altar", 
            "Forest of Slumbering Wind",
            "Kardia Beach",
            "Coliseum of Judgement",
            "Temple of Desire",
            "Proving Grounds",
            "Karciel Cathedral Main Hall" };

        ctfMaps = new String[] { 
            "Abandoned Ruins Waterway",
            "Kalien Cave",
            "Frozen Kardia Altar",
            "Temple of Desire" };

        conquestMaps = new String[] { 
            "Temple of Wind",
            "Regenie Monastery Dungeons",
            "Coliseum of Judgement" };

        destructionMap = new String[] {
            "Edilwood" };
    }

    /**
     * randDeathmatch: Returns a map, randomly selected from the determined array
     */
    public String randDeathmatch(int mapType) {
        String[] randMap;
        String gameMode = "";

        if ( mapType == 1 ) { 
            gameMode = "Deathmatch: \n";
            randMap = deathmatchMaps; }
        else if ( mapType == 2 ) { 
            gameMode = "CTF: \n";
            randMap = ctfMaps; }
        else if ( mapType == 3 ) { 
            gameMode = "Conquest: \n";
            randMap = conquestMaps; }
        else { 
            gameMode = "Destruction: \n";
            randMap = destructionMap; }
        
        int randomIndex = rand.nextInt(randMap.length); // Generate a random index
        return gameMode + randMap[randomIndex];         // Return the map at the random index
    }

}
/*
    //TBD
*/


/**
 * Random Deathmatch: Randomizes deathmatch map array
 */
/*
public String randDeathmatchMaps() { // method for randomizing the randDeathmatch array
    for ( int i = 0; i < deathmatchMaps.length; i++){
        int randIndexToSwap = rand.nextInt(deathmatchMaps.length);
        String temp = deathmatchMaps[randIndexToSwap];
        deathmatchMaps[randIndexToSwap] = deathmatchMaps[i];
        deathmatchMaps[i] = temp;
    } return Arrays.toString(deathmatchMaps);
} */