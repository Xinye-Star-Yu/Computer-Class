import java.util.Scanner;

public class AdvancedCal2 {
 public static void main (String[] args) {
   //Setup Scanner
   Scanner userInput = new Scanner(System.in);
   
   //Ask user for num1 and num2 and sign
   System.out.print("Calculator!\n\n");
   System.out.print("What is your first number?:: ");
   double num1 = userInput.nextDouble();
   System.out.print("What is your second number?:: ");
   double num2 = userInput.nextDouble();
   System.out.print("Type add, subtract, multiply, or divide:: ");
   userInput.nextLine();
   String sign = userInput.nextLine();
   System.out.println("The answer is ");
   
   //Answer to addition
   
      if (sign.equalsIgnoreCase("add")) {
	   System.out.printf("%.0f", num1 + num2);
	} else if (sign.equalsIgnoreCase("subtract")) {
       System.out.printf("%.0f", num1 - num2);
	} else if (sign.equalsIgnoreCase("multiply")) {
       System.out.printf("%.0f", num1 * num2);
	} else if (sign.equalsIgnoreCase("divide")) {
       System.out.printf("%.2f", num1 / num2);
    }
  }
}