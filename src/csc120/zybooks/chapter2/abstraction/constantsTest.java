//package csc120.week1.jan30

public class constantsTest
{
    public static void main(String[] args)
    {
        final int x = 15;
        int y = x + 17;
        // x += 4; expected error created due to constant being modified
        System.out.println("Value of y: " + y);
    }
}