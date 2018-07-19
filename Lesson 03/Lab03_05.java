import java.util.Scanner;
public class Lab03_05 {
	public static void main(String[] args){
		//Setup Scanner
		Scanner userInput = new Scanner(System.in);
		System.out.print("What number would you like the factorial of? :: ");
		int num = userInput.nextInt();
		int i,fac = 1; 
		for (i = 1;i <= num; i++){
		fac = fac * i;
		}
		System.out.print("The answer is " + fac);
	}
}