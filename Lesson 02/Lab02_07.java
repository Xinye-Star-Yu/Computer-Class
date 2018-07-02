import java.util.Scanner;

public class Lab02_07 {
 public static void main (String[] args) {
   //Setup Scanner
   Scanner userInput = new Scanner(System.in);
   
   //Ask user for radius and height
   System.out.print("Welcome to the cylinder surface area calculator!\n\n");
   System.out.print("What is the shape's radius?:: ");
   double radius = userInput.nextDouble();
   System.out.print("What is the shape's height?:: ");
   double height = userInput.nextDouble();
   
   //Answer to problem
   System.out.print("The surface area of the cylinder is approximately ");
   final double PI =  3.14159265359;
   double answer = (2 * PI * radius * height + 2 * PI * radius * radius);
   System.out.printf("%.2f",answer);
 }
}