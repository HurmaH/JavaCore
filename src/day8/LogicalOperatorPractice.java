package day8;

public class LogicalOperatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 10;
		boolean result1 = score>4;
		boolean result2 = score >4 && score <11;//true && true ->true
		boolean result3 = score >14 && score <11; // false && true ->false 
		boolean result4 = score >14 || score <11; // false || true ->false
		System.out.println("result1 is "+ result1);
		System.out.println("result2 is "+ result2);
		System.out.println("result3 is "+ result3);
		System.out.println("result4 is "+ result4);
		
		                     //10>14 && will not continue
		boolean result5 = score++>14 && ++score <14; //first operand is false so it will not go and check second,
		System.out.println("the value of score right now: "+score);
                             
		                     //11>14 & 13<14
		boolean result6 = score++>14 & ++score <15; //first operand is false, it will go and check second operand also,
		System.out.println("the value of score right now: "+score);
		
		System.out.println("result5 is "+ result5);
		System.out.println("result6 is "+ result6);
		
		score = 10;
		                  // true   and false    and  true --> false
		boolean result7 = (score>5) && (score>11) && (score/2 == 5);
		boolean result8 = (score>5) && (score<=11) && (score/2 == 5);
		
		System.out.println("result7 is "+ result7);
		System.out.println("result8 is "+ result8);
		
		

	}

}
