package personal.practice.test3;
import java.util.Scanner;

public class Test3Examples {
    /*
    public static void main(String[] args){
        //Dog dog1 = new Dog("Buddy");
        //Dog dog2 = new Dog("Charlie");
        //System.out.println(dog1.getName() + ", " + dog2.getName());

        Dog[] dogs = {new Dog("Buddy"), new Dog("Charlie")};
        //for (Dog doggo:dogs){
        //    System.out.println(doggo.getName());
        //}
        for(int i = 0; i < dogs.length; i++){
            System.out.println(dogs[i].getName());
        }
    }
    */
    /*
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        // assign values to int's in array
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scnr.nextInt();
        }

        // print array
        System.out.print("[");
        for(int i = 0; i < numbers.length; i++){
            if (i == (numbers.length - 1)){
                System.out.print(numbers[i]);
            } else{
                System.out.print(numbers[i] + ", ");
            }
        } System.out.println("]");

        // find max
        //int max = numbers[0];
        //for(int i = 0; i < numbers.length; i++){
        //    if (numbers[i] > max) max = numbers[i];
        //} System.out.println(max);
        

        // OR this method
        int max = numbers[0];
        for (int num : numbers){
            if (num > max) max = num;
        } System.out.println(max);
    }
    */
    /*
    public static void main(String[] args){
        int num = 27;
        int count = 0;

        while (count < 9){
            num += 3;
            count++;
        }
        System.out.println(num); // 54
    }
    */
    /*
    public static void main(String[] args){
        String str1 = "HIMYM";
        String temp;

        temp = str1.substring(0,2);
        System.out.println(temp);

        temp = str1.substring(2);
        System.out.println(temp);
    }
    */
    /*
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double num1 = scnr.nextDouble();
        double num2 = scnr.nextDouble();
        double sum = num1 + num2;

        System.out.printf("%.2f", sum);
    }
    */
}

