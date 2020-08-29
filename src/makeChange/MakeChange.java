package makeChange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("How much did this item cost?");
		double cost = kb.nextDouble();

		System.out.println("How much money did the customer give you?");
		double moneyRecieved = kb.nextDouble();

		//counters for money
		int ten = 0, five = 0, one = 0, quarter = 0,
			dime = 0, nickle = 0, penny = 0;

		double change = 0;

		if (cost == moneyRecieved) {
			System.out.println("Thank you for exact change as there is a change shortage due to COVID19!!");
		} else if (cost > moneyRecieved) {
			System.err.println("Insuffecient Funds, the items cost: " + cost + " but only you gave: " + moneyRecieved);
		} else {
			//making change into pennies 
			change = (int)((moneyRecieved - cost) * 100);
		}
		
		ten = (int)change/1000;
		change %= 1000;
		System.out.println(ten);
		five = (int)change/500;
		change %= 500;
		System.out.println(five);
		one = (int)change/100;
		change %= 100;
		System.out.println(one);
		quarter = (int)change/25;
		change %= 25;
		System.out.println(quarter);
		dime = (int)change/10;
		change %= 10;
		System.out.println(dime);
		nickle = (int)change/5;
		change %= 5;
		System.out.println(nickle);
		penny = (int)change;
		System.out.println(penny);
		
		
	}
}
