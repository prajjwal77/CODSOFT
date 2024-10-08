package Task3;

public class ATM {
	
	private BankAccount account;

	public ATM(BankAccount account) {
		this.account = account;
	}
	
	public void withdraw(double amount) {
		if(account.withdraw(amount)) {
			System.out.println("Withdrawal successful. New Balance: "+account.getBalance());
		}
		else {
			System.out.println("Withdrawal failed. Insufficient balance:");
		}
	}
	
	public void deposit(double amount) {		account.deposit(amount);
		System.out.println("Deposit successful. New balance: "+account.getBalance());
	}
	
	public void checkBalance() {
		System.out.println("Current balance : "+account.getBalance());
	}
}
