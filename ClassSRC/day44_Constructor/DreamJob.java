package day44_Constructor;

public class DreamJob {

    /*   private fields title , company , annualSalary
    */
	private String title;
	private String company;
	private double annualSalary;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
    /*Encapsulate above private instance fields
    * Create no arg constructor -- constructor with no parameter
    * to set title to “undefined”
      to set company to “unknown”
    */
	public DreamJob () {
		System.out.println("Message from: DreamJob()");
		title = "undefined";
		company = "unknown";
	}
	
	/*constructor with 1 parameter	 
    * Create 1 arg constructor to set title
    */
	public DreamJob (String title) {
    System.out.println("Message from: DreamJob(String title)");
    this.title = title;
	}
	
    /* -- constructor with 3 parameters	 
     *Create 3 arg constructor to set all 3 fields
     */
      
	public DreamJob (String title, String company, double annualSalary ) {
	    System.out.println("Message from: DreamJob(String title, String company, double annualSalary)");
	    this.title = title;
	    this.company = company;
	    this.annualSalary = annualSalary;
		}
	
    /*create a method called toString
    *   it accepts no parameters and
    *   return concatenation of all field value in nice format
    */
	public String toString () {
		
		return "Title: "+this.title +", Company: "+company+", Annual Salary: "+annualSalary;
	}
	
	
	
    	
	
	

}
