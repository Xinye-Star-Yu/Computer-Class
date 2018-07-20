import java.util.Scanner;
public class Lab03_Challenge2 {
public static void main(String[] args) {
Scanner userInput = new Scanner(System.in);
System.out.print("Enter a number:: ");
int num = userInput.nextInt();
System.out.println(fibonacci(num));
}

public static int fibonacci(int num) {
if (num == 1 || num == 2) {
return 1;
}
return fibonacci(num - 1) + fibonacci(num - 2);
}
}