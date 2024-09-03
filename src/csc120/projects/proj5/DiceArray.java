package csc120.projects.proj5;

import java.util.Random;
import java.util.Arrays;

public class DiceArray {
    private int[] dice;
    private boolean[] diceToRoll;

    /* 
     * 
    */
    public DiceArray(int numberOfDice){
        dice = new int[numberOfDice];
        diceToRoll = new boolean[numberOfDice];

        // Assigns each element in dice w/ (obviously unrolled) default values
        for(int i = 0; i < dice.length; i++){
            dice[i] = -1;
        }
        Arrays.fill(diceToRoll, true); // helps manage which dice can be rolled
        for(int i = 0; i < diceToRoll.length; i++){
            diceToRoll[i] = true;
        }
    }

    /*
     * 
     */
    public void roll(){
        Random rand = new Random();
        for(int i = 0; i < dice.length; i++){
            if(diceToRoll[i]){ // rolls each dice, since default constructor sets each element to true
                dice[i] = rand.nextInt(6) + 1; // picks a num btwn 1 & 6
            }
        }
    }

    /*
     * 
     */
    public void keep(int[] diceToKeep){ // param for index of dice to keep
        for (int i = 0; i < diceToRoll.length; i++) {
            diceToRoll[i] = false;
        }
        for(int index:diceToKeep){
            if(index >= 0 && index < diceToRoll.length){
                diceToRoll[index] = true; // only these dice will be rolled
            }
        }
    }

    /*
     * 
     */
    public void reset(){
        for (int i = 0; i < diceToRoll.length; i++) {
            diceToRoll[i] = true;
        }
    }

    /*
     * 
     */
    public int calculateTotal(int faceValue){
        int total = 0;
        for(int die:dice){
            if(die == faceValue){
                total += die;
            }
        } return total;
    }

    /*
     * 
     */
    public String toString(){
        String result = "";
        for (int die:dice){
            result += die + " ";
        }
        result += "\n";
        for (boolean toRoll:diceToRoll){
            if(toRoll) result += "R ";
            else result += "K ";
        } return result;
    }
}