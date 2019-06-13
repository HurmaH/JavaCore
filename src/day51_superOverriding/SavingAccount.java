package day51_superOverriding;

public class SavingAccount extends BankAccount  {
//	String accountName;
//	long accountNumber;
//	double balance;

	double returnRate;

	public SavingAccount(String accountName, long accountNumber, double balance,double returnRate) {
		super(accountName, accountNumber, balance);
		this.returnRate = returnRate;
	}

	@Override
	public String toString() {
		return "SavingAccount [returnRate=" + returnRate 
				         + ", accountName=" + accountName 
				         + ", accountNumber="+ accountNumber 
				         + ", balance=" + balance + "]";
	}
	
	@Override
	public void deposit (int money) {
		//super.deposit(money+100);
		this.balance += money+100;
	}
	
	
	//magic way start to type override method name
    @Override
    public void withdraw(int money) {
    	// TODO Auto-generated method stub
	    //super.withdraw(money+10);
    	this.balance -= (money+10);
    }
	

}
