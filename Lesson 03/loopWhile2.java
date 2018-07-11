public class loopWhile2 {
	public static void main(String[] args){
		System.out.println(fac(5));
	}

	public static int fac(int num){
		if (num > 0){
			System.out.println(num);
			return num * fac(num - 1);
		}
		return 1;
		//5! = 5 * 4 * 3 * 2 * 1 or 120
		//fac is a name
		
	}
}
 