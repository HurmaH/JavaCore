package day50_inheritance;

public class AdminUser extends SlackUser {
	
	int adminLevel;
	public AdminUser() {
		// TODO Auto-generated constructor stub
		//super();
		//this();
		
	}
	
	public AdminUser(int timeZone, String status, int adminLevel ) {
		//super();
//		this.displayName = displayName;
//		this.timeZone = timeZone;
//		this.status = status;
		//super ();
		
		this.adminLevel=adminLevel;
	}
	public AdminUser(String displayName, int timeZone, String status, int adminLevel ) {
		//super();
//		this.displayName = displayName;
//		this.timeZone = timeZone;
//		this.status = status;
		super (displayName, timeZone, status);
		this.adminLevel=adminLevel;
	}

	@Override
	public String toString() {
		return "AdminUser [adminLevel=" + adminLevel + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}
	
	

}
