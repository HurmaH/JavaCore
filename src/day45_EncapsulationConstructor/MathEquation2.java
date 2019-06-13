package day45_EncapsulationConstructor;

public class MathEquation2 {
	
	private double operand1;
	private double operand2;
	private double result;
	private char operator;
	
	//create another overloaded version of calculateX method
	//accept 2 param to set new operand1 and operand2
	//calculate new result
	//return nothing
	public void calculateX (double num1, double num2) {

	    // setting new value for oprand1 oprand2
		this.operand1 = num1;
		this.operand2 = num2;
		
		// do the calculation according to new numbers
	    // and whatever operator value we currently have
	    // AND WE ALREADY HAVE CALCULATE METHOD TO DO THAT !!!
		this.calculate();
	}
	public MathEquation2() {
		System.out.println("no arg");
	}

	public MathEquation2(double operand1, double operand2, char operator) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}

	public void calculate() {
		
		switch (this.operator) {

			case '+':
				this.result = this.operand1 + this.operand2;
				break;
			case '-':
				result = operand1 - operand2;
				
				break;
			case '*':
				result = operand1 * operand2;
				
				break;
			case '/':
				result = operand1 / operand2;			
				break;
			
			default: 
				System.out.println("INVALID @@@!!!");
			
		}

		
	}
	


	public double getOperand1() {
		return operand1;
	}
//	public void setOperand1(int operand1) {
//		this.operand1 = operand1;
//	}
	
	public double getOperand2() {
		return operand2;
	}
//	public void setOperand2(int operand2) {
//		this.operand2 = operand2;
//	}
	
	public char getOperator() {
		return operator;
	}
//	public void setOperator(char operator) {
//		this.operator = operator;
//	}
	
	public double getResult() {
		return result;
	}
	
	public String toString() {
		return "MathEquasion [operand1=" + operand1 + ", operand2=" + operand2 
				+ ", operator= <" + operator + "> | result=" + result +  "]";
	} 
	

}
