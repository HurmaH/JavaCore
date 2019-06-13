package day44_Constructor;

import java.util.Arrays;

public class MathAction {
//In main method in another class create 4 MathEquation objects 
//and call calculate method 
//and print out the result field value 
	public static void main(String[] args) {
		
		//4 object of same type, can be created ne of collections
		MathEquation math1 = new MathEquation(120, 10, '+');
		MathEquation math2 = new MathEquation(12, 10, '-');
		MathEquation math3 = new MathEquation(1.2, 10, '*');
		MathEquation math4 = new MathEquation(140, 10, '/');
		
		//MathEquation [] mathArr = new MathEquation [4];
		MathEquation [] mathArr = {math1, math2, math3, math4};
		
		for ( MathEquation each: mathArr) {
			each.calculate();
			System.out.println(each.getResult());
			System.out.println(each);//each.toString //will give hashcode without toString
		}
		
		System.out.println(Arrays.toString(mathArr));//will give hashcode without toString
		
	}

}
