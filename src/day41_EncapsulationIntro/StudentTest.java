package day41_EncapsulationIntro;

import day40_CustomClass.BankAccount;

public class StudentTest {
	public static void main(String[] args) {
		
		Student hurmik = new Student();
		hurmik.name = "Hurmik";
		hurmik.age = 30;
		hurmik.ssn = 123456789;
		
		hurmik.displayName();
		
		//creating object from BankAccount class in different package
		BankAccount acc1 =new BankAccount ();
		System.out.println(acc1.balance); //balance chnged to public accessor
		//System.out.println(acc1.accountHolder);//instance field gives error because it is default
		
		acc1.add100Dollar();
		
		
	}

}
