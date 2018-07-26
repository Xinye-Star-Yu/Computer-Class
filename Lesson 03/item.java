public class item
{
	String object;
	double price;
	int id;
	
	public item(String o, double p, int i)
	{
		object = o;
		price = p;
		id = i;
	}
	
	public String getObject()
	{
		return object;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setObject(String o)
	{
		object = o;
	}
	
	public void setPrice(double p)
	{
		price = p;
	}
	
	public void setId(int i)
	{
		id = i;
	}
	
}