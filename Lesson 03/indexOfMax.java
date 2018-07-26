import java.util.Arrays;

public class indexOfMax {
public static void main (String[] args) {
int[] myArray = new int[5];
for (int i = 0; i < myArray.length; i++) {
myArray[i] = 1 + (int)((Math.random() * 1000));
}
System.out.println(Arrays.toString(myArray));
System.out.println(indexOfMax(myArray));
}

public static int indexOfMax(int[]a){
int index = 0;
for (int i = 1; i < a.length; i++){
if (a[index] < a[i]){
index = i;
}
}
return index;
}
}