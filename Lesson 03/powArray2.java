import java.util.Arrays;
import java.util.Scanner;
public class powArray2 {
public static void main(String[ ] args) {
Scanner userInput = new Scanner(System.in);
int[] initialArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
System.out.println(Arrays.toString(initialArray));
System.out.print("What power:: ");
int z = userInput.nextInt();
power(initialArray,z);
System.out.println(Arrays.toString(initialArray));
}
public static int[] power(int[] Array, int z){
for (int i = 0; i < Array.length; i++){
Array[i] = (int)Math.pow(Array[i], z);
}
return Array;
}
}