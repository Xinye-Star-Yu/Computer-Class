import java.util.Scanner;
public class Lab03_04 {
	public static void main(String[] args){
		//Setup Scanner
		Scanner userInput = new Scanner(System.in);
		System.out.print("What number would you like the factorial of? :: ");
		int num = userInput.nextInt();
		System.out.print("The answer is ");
		System.out.println(fac(num));
	}

	public static int fac(int num){
		if (num > 0){
			return num * fac(num - 1);
		}
		return 1;
	}
}