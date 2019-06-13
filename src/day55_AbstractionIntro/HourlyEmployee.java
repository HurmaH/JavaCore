package day55_AbstractionIntro;

public class HourlyEmployee extends Employee {
	//private instance fields
	//int id
	//String name
	
	private int MonthlyHourWorked;
	private int hourlyRate;
	
	//constructor to set all 
	public HourlyEmployee(int id, String name, int monthlyHourWorked, int hourlyRate) {
		super(id, name);
		this.MonthlyHourWorked = monthlyHourWorked;
		this.hourlyRate = hourlyRate;
	}
	
	//Getters & Setters
	
	public int getMonthlyHourWorked() {
		return MonthlyHourWorked;
	}

	public void setMonthlyHourWorked(int monthlyHourWorked) {
		MonthlyHourWorked = monthlyHourWorked;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
//	@Override
//	public boolean culateAnnualSalary() {
//		int annual = monthlyHourWorked * hourlyRate * 12;
//		return annual>100000;
//	} 
	
	
	
	@Override
	public void calculateAnnualSalary() {
		int annualSalary = MonthlyHourWorked*hourlyRate*12;
		System.out.println("The salary is: "+annualSalary);
	}

	@Override
	public String toString() {
		return "HourlyEmployee [MonthlyHourWorked=" + MonthlyHourWorked + 
				                    ", hourlyRate=" + hourlyRate + 
				                    ", id= "+ getId() +
				                    ", name= " + getName()+"]";
	}
	
	
	
	

}
