import java.util.Scanner;
public class Lab03_05 {
	public static void main(String[] args){
		//Setup Scanner
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a coefficient integer? :: ");
		int nValue = userInput.nextInt(); 
		userInput.nextLine();
		System.out.println("Enter the size of the table? :: ");
		int tablesize = userInput.nextInt(); 
		userInput.nextLine();
		System.out.println("\nFormula: " + nValue + "x");
		System.out.println("__________________");
		for (int i = 1;i <(tablesize + 1); i++){
			int temp = nValue * i;
			format(i, temp);
		}
		System.out.println("__________________");
	}
	public static void format(int foo, int bar){
		System.out.printf("| %3d |\t%5d\t|\n", foo, bar);
	}
}