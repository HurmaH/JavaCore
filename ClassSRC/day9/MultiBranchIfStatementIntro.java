package day9;

public class MultiBranchIfStatementIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GRADEBOOK
		
		int score =75;
		
		if (90<=score) {
			System.out.println("A");
		}else if (80<=score) {
			System.out.println("B");
		}else if (70<=score) {
			System.out.println("C");
		}else {
			System.out.println("D");
			System.out.println("Study Harder!");
		}
		

//		  if(score>=90) System.out.println("You got A");
//		  if(score>=80) System.out.println("You got B");
//		  if(score>=70) System.out.println("You got C");
//		  if(score>=60) System.out.println("You got D");
//		  else System.out.println("You got F");

	}

}
