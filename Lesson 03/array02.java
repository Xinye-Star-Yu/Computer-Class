import java.util.Arrays;
import java.util.Scanner;
public class array02 {
  public static void main(String[] args) {
	int[] intarray = new int[10];
	Scanner userInput = new Scanner(System.in);
	for (int i = 0; i < intarray.length; i++){
	  intarray[i] = userInput.nextInt();
	}
	
	for (int ele : intarray) {
	  System.out.println(ele);
	}
	System.out.println(Arrays.toString(intarray));
  }
}