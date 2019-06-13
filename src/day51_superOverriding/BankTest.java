package day51_superOverriding;

public class BankTest {
	public static void main(String[] args) {
		
		SavingAccount s1 = new SavingAccount ("Hurmik", 2346829, 1500, 1.5);
		System.out.println(s1);//s1.toString
		
		s1.deposit(1);
		s1.deposit(1);
		System.out.println("current amount "+s1.balance);
		
		
	}
	
	
	

}
