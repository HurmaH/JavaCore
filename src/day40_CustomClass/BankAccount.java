package day40_CustomClass;

public class BankAccount {
	
	//creating 2 instance variable/field/properties/attribute
	String accountHolder;
	public double balance;
	
	//adding behavior
	//create instance(non static) method
	//instant --->need object
	public void showAccountHolder () {
		System.out.println("Account Holder name: "+accountHolder);
	}
	
	public void showBalance () {
		System.out.println("Balance in account :$"+balance);
	}
	
	//increase balance by $100
	public void add100Dollar () {
		balance=balance+100; //in this way we are changing balance variable 
		System.out.println("Increase balance by $100 :$"+balance);
	}
	
	//add <custom> amount dollar to current balance
	public void addDollar (int amount) {
		balance = balance +amount;     //attribute of object is changed
	}
	
	

}
