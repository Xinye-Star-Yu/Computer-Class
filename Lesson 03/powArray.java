import java.util.Arrays;
public class powArray {
public static void main(String[] args) {
int[] initialArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
System.out.println(Arrays.toString(initialArray));
power(initialArray);
System.out.println(Arrays.toString(initialArray));
}
public static int[] power(int[] Array){
for (int i = 0; i < Array.length; i++){
Array[i] = (int)Math.pow(Array[i], 2);
}
return Array;
}
}