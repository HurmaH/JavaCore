package day55_AbstractionIntro;

public class SalariedEmployee extends Employee {
	
	//private instance
//	private int id;
//	private String name;
	private int monthlySalary;
	
	public static void main(String[] args) {
		SalariedEmployee s1 = new SalariedEmployee(101, "Mekan", 10000);
		System.out.println(s1.toString());
		s1.calculateAnnualSalary();
		
		int newMonthlySalary = (int) (s1.getMonthlySalary()*1.1) ; //increase 10% salary
		s1.setMonthlySalary(newMonthlySalary);
		s1.calculateAnnualSalary();
		
		HourlyEmployee h1 = new HourlyEmployee(101, "Hurma", 160, 60);
		System.out.println(h1.toString());
		h1.calculateAnnualSalary();
		
	}
	
	public SalariedEmployee(int id, String name, int monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}
	
	//Getters and Setters
	
	public int getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public void calculateAnnualSalary() {
		int annualSalary = monthlySalary*12;
		System.out.println(annualSalary);
	}
	@Override
	public String toString() {
		return "SalariedEmployee [id=" + getId() 
		                   + ", name=" + getName() 
		                   + ", monthlySalary=" + monthlySalary + "]";
	}
	
	
	

}
