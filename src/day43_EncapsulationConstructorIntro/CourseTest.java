package day43_EncapsulationConstructorIntro;

public class CourseTest {
	
	public static void main(String[] args) {
		
		String s = new String ();
		String s2 = new String ("abc");
		
		Integer i = new Integer(123);
		Integer i2 = new Integer ("123");
		
		Course java = new Course();
		Course selenium = new Course ();
		
//Comparing ways of creating object by calling constructor
		
		Course softSkill = new Course ();  //1 way creating object
		System.out.println(softSkill.name); //null, after this.name="Unkown" will print "unknown.
		
		Course softSkill2 = new Course ("SDLC"); //2 way creating object
		System.out.println(softSkill2.name); //SDLC
		
		Course softSkill3 = new Course ("AGILE", 1234); //3 way creating object
		System.out.println(softSkill3.name);
		System.out.println();
	}
	 

}
