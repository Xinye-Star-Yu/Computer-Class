import java.util.Scanner;

public class Lab02_04 {
 public static void main (String[] args) {
   //Setup Scanner
   Scanner userInput = new Scanner(System.in);
   
   //Ask user for num1 and num2
   System.out.print("Welcome to the division calculator!\n\n");
   System.out.print("What is your first number?:: ");
   double num1 = userInput.nextDouble();
   System.out.print("What is your second number?:: ");
   double num2 = userInput.nextDouble();
   
   //Answer to division problem
   System.out.print("The answer is ");
   System.out.print(num1 / num2);
 }
}