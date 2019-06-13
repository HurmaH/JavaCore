package day56_InterfaceIntro;
//interface is abstract class
public interface Teachable {
	
	//as of Java 7.
	//interface can only have CONSTANT (PUBLIC STATIC FINAL) and ABSTRACT methods
	
	public static final boolean STUDY_HARD = true;
	String SCHOOL="Cybertek"; //it is automatically PUBLIC STATIC FINAL STRING SCHOOL = "Cybertek";
	
	//any method without body or access modifier
	//it's automatically public and abstract
	
	//very common interview /exam question goes as:
    // not providing access modifier in interface 
	// and overriding the method with default access modifier 
	// DOES NOT COMPILE !!! 
	/*public abstract*/void canLearn(); 
	
	public abstract void doHomework();

}
