public class DiceRoll {
 public static void main (String[] args) {
   int num1 = 1 + (int)((Math.random()*6));
   int num2 = 1 + (int)((Math.random()*6));
   System.out.print("Com rolled:: ", num2);
   System.out.println("You rolled:: ", num1);
   
   roll(num2, num1);
 }
 public static String roll(int comp, int user){
   if  (comp > user){
	 return "You Lose";
   }
   
   else if (comp < user){
	 return "You Won";
   } 
   else {
	 return "Tie";
   }
 }
}