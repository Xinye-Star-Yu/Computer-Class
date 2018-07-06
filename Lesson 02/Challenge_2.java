import java.util.Scanner;

public class Challenge_2 {
 public static void main (String[] args) {
   //Setup Scanner
   Scanner userInput = new Scanner(System.in);
   
   //Ask user for num1 and num2 and sign
   System.out.print("Calculator!\n\n");
   System.out.print("What is your first number?:: ");
   double num1 = userInput.nextDouble();
   System.out.print("What is your second number?:: ");
   double num2 = userInput.nextDouble();
   System.out.print("Press 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division:: ");
   int Add = 1;
   int subtract = 2;
   int multiply = 3;
   int divide = 4;
   int sign = userInput.nextInt();
   
   //Answer to addition
   
      if (sign == 1) {
	   System.out.println("The answer is ");
	   double answer = (num1 + num2);
	   System.out.printf("%.0f",answer);
	} else if (sign == 2) {
	   System.out.println("The answer is ");
	   double answer = (num1 - num2);
	   System.out.printf("%.0f",answer);
	} else if (sign == 3) {
	   System.out.println("The answer is ");
	   double answer = (num1 * num2);
	   System.out.printf("%.0f",answer);
	} else if (sign == 4) {
       System.out.print("The answer is ");
       double answer = (num1 / num2);
       System.out.printf("%.2f",answer);
  }
 }
}