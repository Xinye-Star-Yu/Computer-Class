import java.util.Arrays;
public class array01 {
  public static void main(String[] args) {
    int size = 4;
    //Creating arrays normally and setting the size later
    int[] arrayOfInt;
    arrayOfInt = new int[4];
    double[] arrayOfDouble;
    arrayOfDouble = new double[size];
    //Doing it all at once
    String[] arrayOfString = new String[4];
    //Setting the elements to values
    arrayOfInt[0] = 1;
    arrayOfInt[1] = 2;
    arrayOfInt[2] = 3;
    arrayOfInt[3] = 4;
    //NOTE that the size is 4 but the index for the last element is 3 since the
    //index starts at 0

    //Print out the array
    //arrayPrinter(arrayOfInt);
	arrayPrinter(arrayOfInt);
  }
  
  public static void arrayPrinter(int[] intArray){
	  for (int i = 0; i < 4; i++) {
		  System.out.println(intArray[i]);
	  }
  }
}