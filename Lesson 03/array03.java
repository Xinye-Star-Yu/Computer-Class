import java.util.Arrays;
public class array03 {
  public static void main(String[] args) {
    int[] myArray = new int[2];
	//indexed 0-1
	myArray[0] = 6;
	myArray[1] = 9;
	multiplyAllby10(myArray);
	System.out.println(Arrays.toString(myArray));
	AddAllby7(myArray);
	System.out.println(Arrays.toString(myArray));
  }
  public static int[] multiplyAllby10(int[] arr){
	for (int i = 0; i < arr.length; i++){
	arr[i] *= 10;
  }
  return arr;
 }

  public static int[] AddAllby7(int[] arr){
	for (int i = 0; i < arr.length; i++){
	arr[i] += 7;
  }
  return arr;
 }
}