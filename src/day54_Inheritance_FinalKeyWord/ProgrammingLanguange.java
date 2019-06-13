package day54_Inheritance_FinalKeyWord;

public class ProgrammingLanguange extends Language{
	//1.final method
//	@Override
//	public void obeyGrammaRule () {
//		super.obeyGrammaRule();
//	}
	
	//2.static method
//	@Override
//	public static void display () {
//		System.out.println("display language");
//	}
	
	//3. private method
 //   @Override
//    private void turnOn() {
//		System.out.println("Language");
//	}
	
	
	

}

class Language {
	//1
	public final void obeyGrammaRule () {
		System.out.println("MUST OBEY SYNTAX RULE");
	}
	
	//2
	public static void display () {
		System.out.println("display language");
	}
	
	//3
	private void turnOn() {
		System.out.println("Language");
	}
	
}
