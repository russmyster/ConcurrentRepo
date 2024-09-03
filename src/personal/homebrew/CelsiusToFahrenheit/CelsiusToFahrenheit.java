package personal.homebrew.CelsiusToFahrenheit;

import java.util.Scanner;

public class CelsiusToFahrenheit{
   public double CelsiusToFahrenheit(double degreesCelsius) { // no constructor needed here
      return ( (degreesCelsius * (9.0/5.0)) + 32);
   }
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      CelsiusToFahrenheit tempConverter = new CelsiusToFahrenheit();
      double tempF;
      double tempC;

      System.out.println("Enter temperature in Celsius: ");
      tempC = scnr.nextDouble();

      // object tempConverter calls the conversion method
      tempF = tempConverter.CelsiusToFahrenheit(tempC);

      System.out.print("Fahrenheit: ");
      System.out.printf("%.1f\n", tempF);
   }
}