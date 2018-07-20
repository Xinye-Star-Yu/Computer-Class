import java.util.Arrays;
public class array01 {
  public static void main(String[] args) {
    int size = 4;
    int[] arrayOfInt;
    arrayOfInt = new int[4];
    double[] arrayOfDouble;
    arrayOfDouble = new double[size];
    String[] arrayOfString = new String[4];
    arrayOfInt[0] = 1;
    arrayOfInt[1] = 2;
    arrayOfInt[2] = 3;
    arrayOfInt[3] = 4;
	String intArrayF = arrayPrintF(arrayOfInt);
	System.out.println(intArrayF);
	
	for (int i = 0; i < arrayOfDouble.length; i++){
		arrayOfDouble[i] = (i + 1) * 1.5;
	}	
	System.out.println(arrayPrintF(arrayOfDouble));
	
	//Shortcut
	System.out.println(Arrays.toString(arrayOfInt));   
	System.out.println(Arrays.toString(arrayOfDouble));   

  }
  public static void arrayPrinter(int[] intArray){
	  for (int i = 0; i < 4; i++) {
		  System.out.println(intArray[i]);
	}
 }

 public static String arrayPrintF(int[] intArray) {
	String output = "[" + intArray[0];
	for (int i = 1; i < intArray.length; i++){
		output += ", " + intArray[i];
	}
 return output + "]";
 }
 public static String arrayPrintF(double[] intArray) {
	String output = "[" + intArray[0];
	for (int i = 1; i < intArray.length; i++){
		output += ", " + intArray[i];
	}
 return output + "]";
 }
}
