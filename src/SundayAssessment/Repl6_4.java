package SundayAssessment;

public class Repl6_4 {
	private String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;
	public Repl6_4(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.ssn = ssn;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getBirthday() {
		
		return birthmonth+"/"+birthday+"/"+birthyear;
	}
	
	public boolean verifySSN (String str) {
		
		return (str.equals(ssn))?true:false;
	}
	
	
	

}
