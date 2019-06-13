package day55_AbstractionIntro;

public class LocalStudent extends Student {
	
	int seatID;
	public LocalStudent() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attendClass() {
		System.out.println("attend class in classroom");

	}

}
