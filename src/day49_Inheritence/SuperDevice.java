package day49_Inheritence;

public class SuperDevice {
	
	int serialNum;
	
	public SuperDevice() {
		System.out.println("SuperDevice Constructor");
	}
	
	public SuperDevice(int serialNum) {
		System.out.println("SuperDevice Constructor with 1 arg");
		this.serialNum = serialNum;
	}
	
	

}
