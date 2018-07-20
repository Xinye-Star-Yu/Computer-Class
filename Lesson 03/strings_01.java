public class strings_01 {
	public static void main(String[] args){
		String str1 = new String("Hello, World");
		String str2 =  new String("Hello, World");
		// str2 = str2.toUpperCase();
		// System.out.println(str1);
		// System.out.println(str2);
		if (str1 == str2) {
			System.out.println("Eh?");
		} else if (str1.equals(str2)){
			System.out.println("Welp?");
		} else {
			System.out.println("Derp...");
		}
	}
}