package makeChange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double change = 0;
		
		System.out.println("How much did this item cost?");
		double cost = kb.nextDouble();
		
		System.out.println("How much money will you be paying today?");
		double moneyRecieved = kb.nextDouble();
		if (cost == moneyRecieved) {
			System.out.println("Thank you for exact change as there is a change shortage due to COVID19!!");
		} else if (cost > moneyRecieved) {
			System.err.println("Insuffecient Funds, the items cost: " + cost + " but only you gave: " + moneyRecieved);
		} else {
			//making change into pennies 
			change = (int)((moneyRecieved - cost) * 100);
		}
		
		changeOwed(change);
		
		luckyWinner();
		kb.close();
		
	}

	private static void luckyWinner() {
		System.out.println("                CONGRATULATIONS YOU'VE WON!!!                ");
		System.out.println("          ONE FREE MEAL AT ANY SIGMON RESTURAUNT             ");
		System.out.println("use code: SkilDistillery for 10% off of your next online order");
		
	}

	private static void changeOwed(double change) {
		int ten = 0, five = 0, one = 0, quarter = 0,
				dime = 0, nickle = 0, penny = 0;
		
		
		System.out.println("Thank you for shopping at DOUG-MART,"
				+ "\nYour Change will be dispnesed in the following denominations:");
		System.out.println();
		
		ten = (int)change/1000;
		change %= 1000;
		if(ten != 0) {
			System.out.println("\tTens: " + ten);
		}
		
		five = (int)change/500;
		change %= 500;
		if(five != 0) {
			System.out.println("\tFives: " + five);
		}
		
		one = (int)change/100;
		change %= 100;
		if(one != 0) {
			System.out.println("\tDollars:" + one);
		}
		
		quarter = (int)change/25;
		change %= 25;
		if(quarter != 0) {
			System.out.println("\tQuarters: " + quarter);
		}
		
		dime = (int)change/10;
		change %= 10;
		if(dime != 0) {
			System.out.println("\tDimes: " + dime);
		}
		
		nickle = (int)change/5;
		change %= 5;
		if(nickle != 0) {
			System.out.println("\tNickles:" + nickle);
		}
		
		penny = (int)change;
		if(penny != 0) {
			System.out.println("\tPennies: " + penny);
		}
		System.out.println();
		
		
		
	}
}
