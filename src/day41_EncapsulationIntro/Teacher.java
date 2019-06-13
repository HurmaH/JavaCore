package day41_EncapsulationIntro;

public class Teacher {
	
	private String name;
	private String speciality;
	
	//getters & Setters
	
	//getter method is just like any other method
	//it's specifically for getting the fields value
	//and returning it from the method
	//it accepts no Parameter
	
	public String getName () {
		return name;
	}
	
	//getter method is just like any other method
	//it's specifically for setting the fields value
	//and returning nothing
    //it accepts Parameter so we can pass
	
	public void setName (String newName) {
		name=newName;
	}
	
	
	public String getSpeciality () {
		return speciality;
	}
	public void setSpeciality (String newSpeciality) {
		speciality=newSpeciality;
	}
	

}
