package day40_CustomClass;

import java.util.Scanner;

public class BankAccountActivity {
	
	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		b1.accountHolder="Hurma Hay";
		b1.balance = 5005;
		
		b1.showAccountHolder();
		b1.showBalance();
		b1.add100Dollar();
		b1.showBalance(); //it did affect balance after adding $100
		b1.addDollar(300);
		b1.showBalance();
		
		//int amount2=scan.nexInt();
		//b1.addDollar(amount2);
	}

}
