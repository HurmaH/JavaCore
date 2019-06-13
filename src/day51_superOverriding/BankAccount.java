package day51_superOverriding;

public class BankAccount {
	
	String accountName;
	long accountNumber;
	double balance;
	
	
	public BankAccount(String accountName, long accountNumber, double balance) {
		//super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	//toString method
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	
	//deposit accept one int as parameter 
	//and it changes the balance accordingly
	public void deposit (int money) {
		this.balance += money;
	}
	
	//withdraw accept one int as parameter
	//and it changes the balance accordingly
	public void withdraw (int money) {
		this.balance -= money;
	}


}
