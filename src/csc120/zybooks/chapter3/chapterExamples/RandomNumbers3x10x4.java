package csc120.zybooks.chapter3.chapterExamples;

import java.util.Random;
import java.util.Scanner;

//public class GenerateRandomNumbers {
public class RandomNumbers3x10x4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random randGen = new Random();
		int seedVal;
		int remainingCandies;
		int lowerBound;
		int upperBound;
		int bin1;
		int bin2;
		int bin3;
		int bin4;

		seedVal = scnr.nextInt();
		lowerBound = scnr.nextInt();
		upperBound = scnr.nextInt();
		
		System.out.println("Initial: 140");

		randGen.setSeed(seedVal);

		bin1 = randGen.nextInt(upperBound - lowerBound +1 ) + lowerBound;
		bin2 = randGen.nextInt(upperBound - lowerBound +1 ) + lowerBound;
		bin3 = randGen.nextInt(upperBound - lowerBound +1 ) + lowerBound;
		bin4 = randGen.nextInt(upperBound - lowerBound +1 ) + lowerBound;
		
		remainingCandies = 140 - (bin1 + bin2 + bin3 + bin4);

		System.out.println(bin1);
		System.out.println(bin2);
		System.out.println(bin3);
		System.out.println(bin4);
		System.out.println("Remainder: " + remainingCandies);
   }
}