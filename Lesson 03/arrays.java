import java.util.Arrays;
public class arrays {
public static void main (String[ ] args) {
int[ ] size = new int[5];
for (int i = 0; i < size.length; i++) {
int diceNum = 1 + (int)((Math.random() * 1000));
System.out.print("[" + diceNum + "] ,");
}
}
}