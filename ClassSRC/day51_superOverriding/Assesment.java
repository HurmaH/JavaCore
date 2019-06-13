package day51_superOverriding;

public class Assesment {
	
	int questionCount;
	int score;
	String type;
	
	//in our application all assessment has one  shared timeLimit
	static int timeLimit;
	
	public static void printTimeLimit () {
		System.out.println("time Limit " +timeLimit);
	}

	@Override
	public String toString() {
		return "Assesment [questionCount=" + questionCount 
				              + ", score=" + score 
				              + ", type=" + type 
				              + "]";
	}
	
	

}
