package day46_StaticInitializerBlocks;

public class Person {
	
	String name;
	float height;
	char gender ;
	
	static String race = "Human";
	
	static int counter; //static variable, to count created obj., default value 0
	int howMany;        //instance variable
	
	public Person () {
		counter++;
	}

	public Person(String name, float height, char gender) {
		this.name = name;
		this.height = height;
		this.gender = gender;
		counter++; //increasing each time when object is created
		howMany++;
	}
	
	

}
