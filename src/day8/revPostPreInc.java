package day8;

public class revPostPreInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 10;
		
		System.out.println(score++);//10
		System.out.println(score);//11
		
		System.out.println(++score);//12
		System.out.println(score);//12
		
		System.out.println(score--);//12
		System.out.println(score);//11
		
		int result = score++;//11
		System.out.println("result is: " +result);//11
		
		      //12      + 14
		score = score++ +  ++score; //26
		System.out.println(score);
	}

}
