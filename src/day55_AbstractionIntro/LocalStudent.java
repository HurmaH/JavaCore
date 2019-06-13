package day55_AbstractionIntro;

public class LocalStudent extends Student {
//	int id;
//	String name;
	int seatID;
	
	//constructor
	public LocalStudent(int id, String name, int seatID){
		super (id, name);
		this.seatID = seatID;
	}
	
	@Override
	public void attendClass() {
		System.out.println("attend class in classroom");

	}

}
