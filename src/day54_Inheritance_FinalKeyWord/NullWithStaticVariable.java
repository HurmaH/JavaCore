package day54_Inheritance_FinalKeyWord;

public class NullWithStaticVariable {
	public static void main(String[] args) {
		
		//creating object can accept all fieald and methods
		SoccerFinalStatic s1 = new SoccerFinalStatic();// object exists
		s1.printScore();
		s1.printCupName();
		
		SoccerFinalStatic s2 = null;// object does not exists, will compile but will give NullPoint exception during running
//		s2.printScore();     //nullPointer exception
		s2.printCupName();   //as method is static it will run, no need for object
		System.out.println(s2.cupName);//will run with no error, no need for object
	}

}
