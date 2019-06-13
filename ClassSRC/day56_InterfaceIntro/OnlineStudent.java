package day56_InterfaceIntro;
//IMPLEMENTING A INTERFACE ALSO BUILDING A PARENT CHILD RELATIONSHIP 

//WE USE IMPLEMENTS KEYWORD RATHER THAN EXTENDS used by a class
//the class must implements every abstract method  
public class OnlineStudent implements Teachable {
	
	@Override
	public void canLearn() {
		System.out.println("Can learn by hard work");
		
	}
	
	@Override
	public void doHomework() {
		System.out.println("Will do all homework");
	}
	
	public static void main(String[] args) {
		System.out.println(Teachable.STUDY_HARD);// staticly accessing static fields
		System.out.println(STUDY_HARD);
		
	}

}
