package day31_MethodsReturn;

public class Calculator {
	public static void main(String[] args) {
		add(22,19);
		sub(22,10);
		mult(22,5);
		div(22,12);
		mod(21,10);
		
		System.out.println("Calculate Method:");
		calculate(2019,2000);
	}
	
	public static void add (int num1, int num2 ) {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	
	public static void sub (int num1, int num2 ) {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	
	public static void mult (int num1, int num2 ) {
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	
	public static void div (int num1, int num2 ) {
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
	
	public static void mod (int num1, int num2 ) {
		System.out.println(num1+"%"+num2+"="+(num1%num2));
	}
	
	public static void calculate (int num1, int num2 ) {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		
	}

}
