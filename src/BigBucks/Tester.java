package BigBucks;

import java.text.NumberFormat;
import java.util.*;

public class Tester {
	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		ArrayList<BankAccount> aryList = new ArrayList<BankAccount>();
		do {
			Scanner kbReader = new Scanner(System.in);
			System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort)");
			name = kbReader.nextLine();
			if (!name.equalsIgnoreCase("EXIT")) {
				System.out.print("Please enter the amount of the deposit. ");
				double amount = kbReader.nextDouble();
				System.out.println(" ");
				BankAccount inputtedUser = new BankAccount(name, amount);
				aryList.add(inputtedUser);
			}
		} while (!name.equalsIgnoreCase("EXIT"));
		
		BankAccount ba = aryList.get(0);
		double maxBalance = ba.balance;
		String maxName = ba.name;
		for (BankAccount bankAccount : aryList) {
			if (bankAccount.balance > maxBalance) {
				maxBalance = bankAccount.balance;
				maxName = bankAccount.name;
			}
		}
		System.out.println("The account with the largest balance belongs to " + maxName);
		System.out.println("This amount is $" + formatter.format(maxBalance));
	}
}
