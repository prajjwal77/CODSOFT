package Task3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		BankAccount account =new BankAccount(1000);
		ATM atm =new ATM(account);
		
		Scanner scanner=new Scanner(System.in);
		
		int option;
		
		do {
			System.out.println("ATM Menu : ");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Choose an option: ");
			option=scanner.nextInt();
			
			switch (option) {
			case 1:
				System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                atm.withdraw(withdrawAmount);
				break;
			case 2:
				System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                atm.deposit(depositAmount);
				break;
			case 3:
				atm.checkBalance();
				break;
			case 4:
				System.out.println("Exit...");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
			

		}while(option!=4); 
		scanner.close();
	}
}
