package personal.practice;
import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter loop value: ");
        int loopValue = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= loopValue; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print the number
            System.out.println(i);
        }
    }
}
