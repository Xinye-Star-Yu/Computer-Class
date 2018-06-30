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
   System.out.print(2 * 3.14 * radius * height + 2 * 3.14 * radius * radius);
 }
}