import java.util.Scanner;
public class DiscountReceiptTest {
	public static void main(String[] args){
	//Setup Scanner
	Scanner userInput = new Scanner(System.in);	
		item[] shoppingList = new item[4];
		double totalPrice = 0;
		for(int i = 0; i < shoppingList.length; i++){
			System.out.print("What item do you want to buy?:: ");
			String itemName = userInput.nextLine();
			System.out.print("What is the price?:: ");
			double itemPrice = userInput.nextDouble();
			int itemId = 100000 + (int)(Math.random()*999999);
			shoppingList[i] = new item(itemName, itemPrice, itemId);
			totalPrice += itemPrice;
			userInput.nextLine();
		}

		double subtotal;
		double discount = 0.85;
		double tax = 1.08;	
		if(calcDiscount(totalPrice)){
			subtotal = discount * totalPrice;
		}
		else {
			subtotal = totalPrice;
		}
		printreceipt(shoppingList, subtotal, tax, discount, totalPrice);
		
	}
			
	public static boolean calcDiscount(double totalPrice){
		if (totalPrice > 2000){
			return true;
			}
			return false;
		}
			
	public static void printreceipt(item[] shoppingList, double subtotal, double tax, double discount, double totalPrice){
		System.out.println("---------------");
		System.out.println("----Receipt----");
		System.out.println("---------------");
		for (int i = 0; i < shoppingList.length; i++){
			System.out.println(shoppingList[i].toString());
		}
		System.out.println("Subtotal :: " + totalPrice);
		if (calcDiscount(totalPrice)){
			subtotal = totalPrice * discount;
			System.out.println("Discount(15%):: " + (totalPrice * (discount)));
			System.out.println("Tax(8%):: " + (subtotal * (tax - 1)));
			System.out.println("Total:: " + (subtotal * tax));
		}
		else {
		System.out.println("Tax:: " + (totalPrice * (tax - 1)));
		System.out.println("Total:: " + (subtotal * tax));	
		}
	}
}