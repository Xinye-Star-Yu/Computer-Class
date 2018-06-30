import java.util.Scanner;

public class input {
 public static void main (String[] args) {
   //Setup Scanner
   Scanner userInput = new Scanner(System.in);
   
   //Ask user for first and last name
   System.out.print("What is your first name:: ");
   String firstName = userInput.nextLine();
   System.out.print("What is your last name:: ");
   String lastName = userInput.nextLine();
   System.out.println("\nHello " + firstName + " " + lastName + ". How are you doing?");
   String fullName = firstName + " " + lastName;
   System.out.println("\nHello " + fullName + ". How are you doing?");
   
   //Ask user for age
   System.out.print("What is your age:: ");
   int age = userInput.nextInt();
   System.out.println("I see " + fullName +". You are " + age + " years old.");
  }
}