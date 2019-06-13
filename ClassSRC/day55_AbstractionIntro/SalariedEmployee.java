package day55_AbstractionIntro;

public class SalariedEmployee extends Employee {
	
	//private instance
//	private int id;
//	private String name;
	private int monthlySalary;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public void calculateAnnualSalary() {
		int annualSalary = monthlySalary*12;
	}
	@Override
	public String toString() {
		return "SalariedEmployee [id=" + id + ", name=" + name + ", monthlySalary=" + monthlySalary + "]";
	}
	
	
	

}
