package makeChange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		double cost = costPrompt();
		double moneyRecieved = MoneyTendered();
		
		if (cost == moneyRecieved) {
			System.out.println("Thank you for exact change as there is a change shortage due to COVID19!!");
		} else if (cost > moneyRecieved) {
			System.err.println("Insuffecient Funds, the items cost: " + cost + " you gave " + moneyRecieved);
		}
		
	}

	private static double MoneyTendered() {
		Scanner kb = new Scanner(System.in);
		System.out.println("How much money did the customer give you?");
		double moneyRecieved;
		moneyRecieved = kb.nextDouble();	
		return moneyRecieved;
	}

	private static double costPrompt() {
		Scanner kb = new Scanner(System.in);
		System.out.println("How much did this item cost?");
		double cost;
		cost = kb.nextDouble();
		return cost;
	}
	

}
