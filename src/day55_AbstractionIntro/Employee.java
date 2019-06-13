package day55_AbstractionIntro;

public abstract class Employee {
	
	//reusable fields
	private int id;
	private String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Employee(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}


	//abstract method
	public abstract void calculateAnnualSalary();


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
    
	

}
