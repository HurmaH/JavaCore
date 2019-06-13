package day55_AbstractionIntro;

public class HourlyEmployee extends Employee {
	//private instance fields
	private int id;
	private String name;
	private int MonthlyHourWorked;
	private int hourlyRate;
	
	//constructor to set all 
	public HourlyEmployee(int id, String name, int monthlyHourWorked, int hourlyRate) {
		//super();
		this.id = id;
		this.name = name;
		this.MonthlyHourWorked = monthlyHourWorked;
		this.hourlyRate = hourlyRate;
	}
	
	//Getters & Setters
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
	
	
	public void calculateAnnualSalary() {
		int annualSalary = MonthlyHourWorked*hourlyRate*12;
	}
	
	
	
	

}
