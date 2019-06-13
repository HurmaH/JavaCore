package day8;

public class Conditional3 {
	public static void main(String[] args) {
		
		boolean isTimeToEndClass = true;
		
		boolean isTopicFinished = false;
		
		if (isTimeToEndClass == true && isTopicFinished == true) {
			System.out.println("Let's end the session");
		}else {
			System.out.println("Hang on tight");
		}
		
		if (isTopicFinished == false) {
			System.out.println("Can we finish it in a few minutes");
		}else {
			System.out.println("We can go now");
		}
		
		
	}

}
