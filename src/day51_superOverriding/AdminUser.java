package day51_superOverriding;

public class AdminUser extends SlackUser {
	
	int adminLevel;
	
	public AdminUser(String displayName, String status, int timeZone,  int adminLevel ) {
		//super();
//		this.displayName = displayName;
//		this.timeZone = timeZone;
//		this.status = status;
		super (displayName, timeZone, status);
		this.adminLevel=adminLevel;
	}

	@Override
	public void senMessage (String message) {
		System.out.println("@channel Dear good people of sparta");
		System.out.println("<"+displayName+"> is sending message <"
		+message+">");
	}
	
	@Override
	//optional annotation to make sure
	//you are overriding it correctly
	public String toString() {
		return "AdminUser [adminLevel=" + adminLevel + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}
	
	public static void main(String[] args) {
		
		AdminUser a1 = new AdminUser ("B11", "FULLY Carged", 5,1);
		a1.senMessage("abc");

	}

}
