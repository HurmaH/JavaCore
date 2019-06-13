package day46_StaticInitializerBlocks;

public class SlackUser {
	private String name;
	private String email;
	private int groupName;
	
	//getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGroupName() {
		return groupName;
	}
	public void setGroupName(int groupName) {
		this.groupName = groupName;
	}
	
	//3 args constructor
	public SlackUser(String name, String email, int groupName) {
		this.name = name;
		this.email = email;
		this.groupName = groupName;
	}
	
	//no arg constructor
	public SlackUser() {
		this ("Mentor", "mentor@cybertek.com", 0);
	}
	
	
	//toString method
	public String toString() {
		return "SlackUser [name=" + name + ", email=" + email + ", groupName=" + groupName + "]";
	}
	
	//sendMessage
	public void sendMEssage (String channel, String content) {
		System.out.println("User <"+this.name+">");
		System.out.println("Message <"+content+">");
		System.out.println("Channel <"+channel+">");
	}
	
	
	
	
	
	
	
	
	
	
	

	

}
