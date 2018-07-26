public class Farmer
{
	public static void main(String[] args){
		{
			Farm pig = new Farm("pig" , "Bacon" , 2, "Oink");
			System.out.println(pig.getAnimal());
			System.out.println(pig.getProduct());
			System.out.println(pig.getAge());
			System.out.println(pig.getNoise());
		
			Farm cow = new Farm("cow" , "Beef" , 2, "Moo");
			System.out.println(cow.getAnimal());
			System.out.println(cow.getProduct());
			System.out.println(cow.getAge());
			System.out.println(cow.getNoise());
			
			Farm chicken = new Farm("chicken" , "egg" , 2, "Cuck");
			System.out.println(chicken.getAnimal());
			System.out.println(chicken.getProduct());
			System.out.println(chicken.getAge());
			System.out.println(chicken.getNoise());
			
			Farm sheep = new Farm("sheep" , "wool" , 2, "Baa");
			System.out.println(sheep.getAnimal());
			System.out.println(sheep.getProduct());
			System.out.println(sheep.getAge());
			System.out.println(sheep.getNoise());
		}
	}
}