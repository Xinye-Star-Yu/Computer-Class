import java.util.Scanner;
public class bobo2 {
public static void main (String[] args) {
Scanner userInput = new Scanner(System.in);
System.out.print("What size?:: ");
int size = userInput.nextInt();
int[] intArray = new int[size];
String[] stringArray = new String[size];
for (int i = 0; i < size; i++){
System.out.println("What number:: ");
intArray[i] = userInput.nextInt();
userInput.nextLine();
System.out.println("String please enter the code::");
stringArray[i] = userInput.nextLine();
}
printArray(intArray, stringArray);
}

public static void printArray(int[] a, String[] b){
for (int i = 0; i < a.length; i++){
System.out.print(a[i] + b[i] + " ");
}
}
}