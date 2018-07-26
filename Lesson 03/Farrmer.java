public class Farmer
{
	public static void main(String[] args){
	 {
		SampleClass sc = new SampleClass(1, 2, "Hello World");
		System.out.println(sc.getVar1());
		System.out.println(sc.getVar2());
		sc.setVar1(10);
		sc.setVar2(15);
		System.out.println(sc.getVar1());
		System.out.println(sc.getVar2());
		SampleClass sc2 = new SampleClass(4, 6, "Goodbye, World");
		System.out.println(sc.getVar3());
		System.out.println(sc.getVar1());
		
	 }
	}
}