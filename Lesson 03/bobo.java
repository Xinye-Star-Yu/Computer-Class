import java.util.Arrays;
public class bobo {
public static void main (String[ ] args) {
int[] size = new int[5];
for (int i = 0; i < size.length; i++) {
size[i] = 1 + (int)((Math.random() * 1000));
}
System.out.println(Arrays.toString(size));
}
}
