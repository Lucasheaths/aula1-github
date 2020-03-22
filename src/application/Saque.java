package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Atributos;

public class Saque {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accountNumber = scanner.nextInt();

		System.out.println("Enter account holder: ");
		String accountHolder = scanner.next();

		System.out.println("Is there na initial deposit (y/n)? ");
		String requireInitialDeposit = scanner.next();
		float initialDeposit = 0;

		if (requireInitialDeposit.equalsIgnoreCase("y")) {
			System.out.println("Enter initial deposit value: ");
			initialDeposit = scanner.nextFloat();
		}

		System.out.println("Account data: ");
		System.out.println("Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + initialDeposit);

		System.out.println("Enter a deposit value: ");
		float depositValue = scanner.nextFloat();
		initialDeposit += depositValue;

		System.out.println("Updated account data: ");
		System.out.println("Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + initialDeposit);

		System.out.println("Enter a widthdraw value: ");
		float withdrawValue = scanner.nextFloat();
		initialDeposit -= withdrawValue;

		System.out.println("Updated account data: ");
		initialDeposit -= 5;
		System.out.println("Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + initialDeposit );
	}

}
