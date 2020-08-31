package makeChange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double change = 0;

		boolean flag = true;
		double cost = 0;
		double moneyRecieved = 0;
		
		// added while statement if customer forgot something and their cost increased
       // if they do need to add more items they can update their cost if not, the code will continue
		while (flag) {
			System.out.println("Enter how much does this order cost? ($XX.xx)");
			cost = kb.nextDouble();

			System.out.println("Enter how much money will you be paying today? ($XX.xx)");
			moneyRecieved = kb.nextDouble();
			
			System.out.println("Do you need to add more items? [Y/N]");
			String moreItems = kb.next();
			if (moreItems.equals("N")) {
				flag = false;
			}
		}
		
		// else if statement to take care of specific cases before starting the calculations for change	
		System.out.println(change);
		change = changeCalc(cost, moneyRecieved, change);
		
		// winning promotions -- example --> 20.00-16.64 = 3.36
		if (change == 336 && cost >= 10.00) {
			luckyWinner();

		}
		// called method to calculate and print out change in specific denominations
		changeOwed(change);

		kb.close();

	}
	
	private static double changeCalc( double cost, double moneyRecieved, double change) {
		if (cost == moneyRecieved) {
			System.out.println("Thank you for exact change as there is a change shortage due to COVID19!!");
		} else if (cost > moneyRecieved) {
			System.err.println(
					"Insuffecient Funds, the items cost: " + cost + " but only you gave: " + moneyRecieved);
		} else {
			// making change into pennies and add 0.9 for any inaccuracies dealing with double addition or subtraction 
			change =  (int)(((moneyRecieved - cost) * 100) + 0.9);
			System.out.println(change);
		}
		return change;
		
	}

	private static void luckyWinner() {
		System.out.println("                CONGRATULATIONS YOU'VE WON!!!                ");
		System.out.println("          ONE FREE MEAL AT ANY SIGMON RESTURAUNT             ");
		System.out.println("use code: SkilDistillery for 10% off of your next online order");

	}

	private static void changeOwed(double change) {
		int ten = 0, five = 0, one = 0, quarter = 0, dime = 0, nickle = 0, penny = 0;

		System.out.println("Thank you for shopping at DOUG-MART,"
				+ "\nYour Change will be dispnesed in the following denominations:");
		System.out.println();

		ten = (int) change / 1000;
		change %= 1000;
		if (ten != 0) {
			System.out.println("\tTens: " + ten);
		}

		five = (int) change / 500;
		change %= 500;
		if (five != 0) {
			System.out.println("\tFives: " + five);
		}

		one = (int) change / 100;
		change %= 100;
		if (one != 0) {
			System.out.println("\tDollars:" + one);
		}

		quarter = (int) change / 25;
		change %= 25;
		if (quarter != 0) {
			System.out.println("\tQuarters: " + quarter);
		}

		dime = (int) change / 10;
		change %= 10;
		if (dime != 0) {
			System.out.println("\tDimes: " + dime);
		}

		nickle = (int) change / 5;
		change %= 5;
		if (nickle != 0) {
			System.out.println("\tNickles:" + nickle);
		}

		penny = (int) change;
		if (penny != 0) {
			System.out.println("\tPennies: " + penny);
		}
		System.out.println();

	}
}
