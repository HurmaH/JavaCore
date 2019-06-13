package day45_EncapsulationConstructor;

import java.util.Arrays;

public class Spartan {
	
	String name ;
	int studyHour;
	int horsePower;
	boolean tired;
	String [] certificates;
	
	//this no arg constructor should set default value for above fields
	public Spartan () {
		this("No name", 5); //constructor chaning
		this.horsePower = 320;
		//this.name="No name";
		//this.studyHour = 5;
	    System.out.println("no arg");	
		
	}
	
	public Spartan (String name, int studyHour) {
		this.name=name;
		this.studyHour = studyHour;
	}
	
	 // CREATE A CONSTRUCTOR THAT TAKE ONE ARG boolean tired
	  // inside this constructor 
	  //  call the constructor that that take 5 args
	    // to set all your default value 
	
	public Spartan (boolean tired) {
		
		this ("Hurma", 10, 150, tired, new String [] {"OCA", "PSM1"});
	}

	public Spartan(String name, int studyHour, int horsePower, boolean tired, String[] certificates) {
		this (name, studyHour);
		//this.name = name;
		//this.studyHour = studyHour;
		this.horsePower = horsePower;
		this.tired = tired;
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Spartan [name=" + name + ", studyHour=" + studyHour + ", horsePower=" + horsePower + ", tired=" + tired
				+ ", certificates=" + Arrays.toString(certificates) + "]";
	}
	
	

}
