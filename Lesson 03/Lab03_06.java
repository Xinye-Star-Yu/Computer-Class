public class Lab03_06 {
	public static void main(String[ ] args) {
		int tablesize = 12; 
		System.out.println("  ______________________________");
		for (int i = 1; i <= tablesize; i++){
		System.out.print(" | ");
			for(int j = 1; j <= tablesize; j++){
			System.out.print((i*j) + " ");
			}
		System.out.println();
		}
	}
}