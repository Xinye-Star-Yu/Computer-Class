import java.util.Scanner;

public class Lab02_05 {
 public static void main (String[] args) {
   //Setup Scanner
   Scanner userInput = new Scanner(System.in);
   
   //Ask user for name, weight, and age
   System.out.print("Welcome to the most accurate BMI calculator!\n\n");
   System.out.print("What is your name?:: ");
   String name = userInput.nextLine();
   System.out.print("What is your weight in kilograms?:: ");
   double weight = userInput.nextDouble();
   System.out.print("What is your height in meters?:: ");
   double height = userInput.nextDouble();
   
   //User BMI
   System.out.print("Ok ");
   System.out.print(name);
   System.out.println(", your BMI is ");
   System.out.print(weight / height / height);
   System.out.print("\n\nThe healthy BMI range is between 18.5-24.9");
 }
}