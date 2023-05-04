package assignment;


import java.util.Scanner;

/**
 * CurrencyConverter
 */
public class CurrencyConvertor {

	public static void main(String[] args) {
		
		System.out.println("1 Ruppe");
		System.out.println("2 Dollar");
		System.out.println("3 Euro");
		System.out.println("4 Pound");
		// take input
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the currency");
		int choice = sc.nextInt();
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		
		// convert the amount
		switch (choice) {
		case 1:
			Ruppe_to_other(amount);
			break;
		case 2:
			Dollar_to_other(amount);
			break;
		case 3:
			Euro_to_other(amount);
			break;
		case 4:
			Pound_to_other(amount);
			break;
		default:
			System.out.println("Invalid choice");
		}

	}

	public static void Ruppe_to_other(double amt) {
		System.out.println("1 Ruppe = " + 0.013 + " Dollar");
		System.out.println(amt + " Ruppe = " + (amt * 0.013) + " Dollar");
		System.out.println("----------------------------------------------------------");
		System.out.println("1 Ruppe = " + 0.012 + " Euro");
		System.out.println(amt + " Ruppe = " + (amt * 0.012) + " Euro");
		System.out.println("----------------------------------------------------------");
		System.out.println("1 Ruppe = " + 0.0098 + " Pound");
		System.out.println(amt + " Ruppe = " + (amt * 0.0098) + " Pound");
		System.out.println();

	}

	public static void Dollar_to_other(double amt) {
		System.out.println("1 Dollar = " + 79.37 + " Ruppe");
		System.out.println(amt + " Dollar = " + (amt * 79.37) + " Ruppe");
		System.out.println("----------------------------------------------------------");
		System.out.println("1 Dollar= " + 0.98 + " Euro");
		System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
		System.out.println("----------------------------------------------------------");
		System.out.println("1 Dollar= " + 0.80 + " Pound");
		System.out.println(amt + " Dollar = " + (amt * 0.80) + " Pound");
	}

	public static void Euro_to_other(double amt) {
		System.out.println("1 Euro = " + 80.85 + " Ruppe");
		System.out.println(amt + " Euro = " + (amt * 80.85) + " Ruppe");
		System.out.println("----------------------------------------------------------");
		System.out.println("1 Euro = " + 1.02 + " Dollar");
		System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar");
		System.out.println("----------------------------------------------------------");
		System.out.println("1 Euro = " + 0.88 + " Pound");
		System.out.println(amt + " Euro = " + (amt * 0.88) + " Pound");
	}
	public static void Pound_to_other(double amt) {
		System.out.println("1 Pound = " + 102.06 + " Ruppe");
		System.out.println(amt + " Pound = " + (amt * 102.06) + " Ruppe");
		System.out.println("----------------------------------------------------------");
		System.out.println("1 Pound = " + 1.25 + " Dollar");
		System.out.println(amt + " Pound = " + (amt * 1.25) + " Dollar");
		System.out.println("----------------------------------------------------------");
		System.out.println("1 Pound = " + 1.13 + " Euro");
		System.out.println(amt + " Pound = " + (amt * 1.13) + " Euro");
	}
}