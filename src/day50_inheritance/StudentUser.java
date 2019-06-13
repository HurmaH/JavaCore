package day50_inheritance;

public class StudentUser extends SlackUser {
	
	public static void main(String[] args) {
		StudentUser s1 = new StudentUser();
		System.out.println("----------");
		System.out.println();
		
		StudentUser s2 = new StudentUser("Hurma", 5, "Online", 29);
		System.out.println(s2);
		
		
	}
	
	int groupNumber;
	
	public StudentUser() {
		//super() --> calls implicitly super class constructor no arg 
		System.out.println("StudentUser no agr");
	}
	
	public StudentUser(String displayName, int timeZone, String status, int groupNumber ) {
		//super();
//		this.displayName = displayName;
//		this.timeZone = timeZone;
//		this.status = status;
		super (displayName, timeZone, status);
		this.groupNumber = groupNumber;
	}

	
	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}
	
	public void displayGroup () {
		System.out.println("<"+this.displayName+"> is member of group <"+this.groupNumber+">");
	}

}
