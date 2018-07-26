public class Farm
{
	String animal;
	String product;
	int age;
	String noise;
	
	public Farm(String a, String p, int ag, String n)
	{
		animal = a;
		product = p;
		age = ag;
		noise = n;
	}
	
	public String getAnimal()
	{
		return animal;
	}
	
	public String getProduct()
	{
		return product;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getNoise()
	{
		return noise;
	}
	
	public void setAnimal(String a)
	{
		animal = a;
	}
	
	public void setProduct(String p)
	{
		product = p;
	}
	
	public void setAge(int ag)
	{
		age = ag;
	}
	public void setNoise(String n)
	{
		noise = n;
	}
}