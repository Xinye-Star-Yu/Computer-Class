import java.util.Scanner;

public class Calculator_New {
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
   int sign = userInput.nextInt();
   System.out.println("The answer is ");
   
   //Answer to addition
   
      if (sign == 1) {
	   System.out.printf("%.0f", doAdd(num1, num2));
	} else if (sign == 2) {
       System.out.printf("%.0f", doSubtract(num1, num2));
	} else if (sign == 3) {
       System.out.printf("%.0f", doMultiply(num1, num2));
	} else if (sign == 4) {
       System.out.printf("%.2f", doDivide(num1, num2));
    }
  }

 //Add, Substract, Multiply, Divide variables
 public static double doAdd(double num1, double num2){
    return num1 + num2;
  }
 public static double doSubtract(double num1, double num2){
	return num1 - num2;
  }   
 public static double doMultiply(double num1, double num2){
	return num1 * num2;
  }
 public static double doDivide(double num1, double num2){
	return num1 / num2;
  }
}