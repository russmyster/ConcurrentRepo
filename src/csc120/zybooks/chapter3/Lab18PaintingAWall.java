package csc120.zybooks.chapter3;

import java.util.Scanner;

public class Lab18PaintingAWall {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        double wallHeight = scnr.nextDouble();
        double wallWidth = scnr.nextDouble();
        double costOfPaintCan = scnr.nextDouble();
        scnr.close();

        double area = wallHeight * wallWidth;
        double requiredPaint = area / 350.0;
        double requiredPaintCans = Math.ceil(requiredPaint);
        double totalCostBeforeTax = (costOfPaintCan * requiredPaintCans);
        double salesTax = totalCostBeforeTax * 0.07;
        double totalCost = totalCostBeforeTax + salesTax;

        System.out.printf("Wall area: %.1f sq ft\n", area);
        System.out.printf("Paint needed: %.3f gallons\n", requiredPaint);
        System.out.println("Cans needed: " + (int) requiredPaintCans + " can(s)");
        System.out.printf("Paint cost: $%.2f\n", costOfPaintCan);
        System.out.printf("Sales tax: $%.2f\n", salesTax);
        System.out.printf("Total cost: $%.2f\n", totalCost);
    }
}
