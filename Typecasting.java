public class TypeCasting {
	public static void main(String[] args){
		int num1 = 50;
		int num2 = 200;
		
		double division = num1/num2;
		System.out.printf("The division is %f%n",division);
		
		double price = 7658;
		System.out.printf("The price of laptop is %f%n",price);
		
		
		double balance = 5693.875;
		int convertedBalanced = (int)balance;
		System.out.printf("The converted balance is %d%n", convertedBalanced);
		
		char symbol = '?';
		int convertedSymbol = (int)symbol;
		System.out.printf("The converted symbol is %d%n",convertedSymbol);
		
		}
}