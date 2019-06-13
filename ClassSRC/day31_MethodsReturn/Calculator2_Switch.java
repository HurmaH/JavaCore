package day31_MethodsReturn;

public class Calculator2_Switch {
	public static void main(String[] args) {
		int a1=100;
		int a2=25;
		calculator ('+', a1, a2);
		calculator ('-', a1, a2);
		calculator ('*', a1, a2);
		calculator ('/', a1, a2);
		calculator ('%', a1, a2);
	}
	
	public static void calculator (char operator, int num1, int num2) {
		switch (operator) {
		case '+':
			System.out.println("result of addition is: "+(num1+num2));
			break;
		case '-':
			System.out.println("result of subtraction is: "+(num1-num2));
			break;
		case '*':
			System.out.println("result of multiplication is: "+(num1*num2));
			break;
		case '/':
			System.out.println("result of division is: "+(num1/num2));
			break;
		case '%':
			System.out.println("result of remainder is: "+(num1%num2));
			break;
		}
	}

}
