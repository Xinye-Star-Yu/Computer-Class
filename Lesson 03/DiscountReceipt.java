public class DiscountReceipt
{
	public static void main(String[] args){
		{
			item computer = new item("computer" , 899.99 , (100000 + (int)(Math.random()*999999)));
			System.out.println(computer.getObject());
			System.out.println(computer.getPrice());
			System.out.println(computer.getId());
			double computerprice = 899.99;
			
			item monkey = new item("monkey" , 199.99 , (100000 + (int)(Math.random()*999999)));
			System.out.println(monkey.getObject());
			System.out.println(monkey.getPrice());
			System.out.println(monkey.getId());
			double monkeyprice = 199.99;
			
			item sandwich = new item("sandwich" , 9.99 , (100000 + (int)(Math.random()*999999)));
			System.out.println(sandwich.getObject());
			System.out.println(sandwich.getPrice());
			System.out.println(sandwich.getId());
			double sandwichprice = 9.99;
			
			item shoes = new item("shoes" , 19.99 , (100000 + (int)(Math.random()*999999)));
			System.out.println(shoes.getObject());
			System.out.println(shoes.getPrice());
			System.out.println(shoes.getId());
			double shoesprice = 19.99;

			double subtotal;
			if (computerprice + monkeyprice + sandwichprice + shoesprice > 2000){
				double discount = 0.15;
				subtotal = (computerprice + monkeyprice + sandwichprice + shoesprice) * discount;
			}
			else {
				subtotal = computerprice + monkeyprice + sandwichprice + shoesprice;
			}
			double tax = 1.08;
			System.out.println("Your total is ");
			System.out.printf("%.2f",subtotal * tax);
		}
	}
}