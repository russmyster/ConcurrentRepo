package csc120.projects.proj5;

public class Project5Testing {
    public static void main(String[] args) {
        // Testing parameterized constructor
        System.out.println("Testing the parameterized constructor with an argument of 5:");
        DiceArray diceArray = new DiceArray(5);
        System.out.println(diceArray.toString());

        // Testing roll method
        System.out.println("\nTesting the roll method:");
        diceArray.roll();
        System.out.println(diceArray.toString());

        // Testing keep method w/ an argument of 1 (keep second die)
        System.out.println("\nCall the keep method with an argument of 1, then roll again:");
        diceArray.keep(new int[]{1});
        diceArray.roll();
        System.out.println(diceArray.toString());

        // Testing keep method w/ an argument of 2 (keep third die)
        System.out.println("\nCall the keep method with an argument of 2, then roll again:");
        diceArray.keep(new int[]{2});
        diceArray.roll();
        System.out.println(diceArray.toString());

        // Testing keep method w/ an argument of 3 (keep fourth die)
        System.out.println("\nCall the keep method with an argument of 3, then roll again:");
        diceArray.keep(new int[]{3});
        diceArray.roll();
        System.out.println(diceArray.toString());

        // Testing reset method
        System.out.println("\nCall the reset method, then roll again:");
        diceArray.reset();
        diceArray.roll();
        System.out.println(diceArray.toString());

        // Testing calculateTotal method
        System.out.print("\nCalculating the sum of all the 1s: "
                       + (diceArray.calculateTotal(1)) + "\n");
        System.out.print("Calculating the sum of all the 2s: "
                       + (diceArray.calculateTotal(2)) + "\n");
        System.out.print("Calculating the sum of all the 3s: "
                       + (diceArray.calculateTotal(3)) + "\n");
        System.out.print("Calculating the sum of all the 4s: "
                       + (diceArray.calculateTotal(4)) + "\n");
        System.out.print("Calculating the sum of all the 5s: "
                       + (diceArray.calculateTotal(5)) + "\n");
        System.out.print("Calculating the sum of all the 6s: "
                       + (diceArray.calculateTotal(6)) + "\n");
    }
}
