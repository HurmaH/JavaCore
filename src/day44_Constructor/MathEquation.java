package day44_Constructor;

public class MathEquation {
//	add 4 private fields : oprand1 , oprand2 , result as double operator as char 
	private double  oprand1;
	private double  oprand2;
	private double  result; 
	private char operator;
//	Encapsulate first 3 fields : with getters and setters
//provide only getter for the result 	
	
	public double getOprand1() {
		return oprand1;
	}
	public void setOprand1(double oprand1) {
		this.oprand1 = oprand1;
	}
	
	public double getOprand2() {
		return oprand2;
	}
	public void setOprand2(double oprand2) {
		this.oprand2 = oprand2;
	}
	
	public double getResult() {
		return result;
	}
	

	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
//	Create no arg constructor just print out message from no Arg 
public MathEquation() {
	System.out.println("Message from: MathEquation()" );
}

//	create 1 arg constructor set the operator value 
public MathEquation(char operator) {
	this.operator = operator;
}

//	create 3 args constructor set all 3 fields value 
//: oprand1, oprand2, operator 
public MathEquation(double oprand1, double oprand2, char operator) {
	this.oprand1 = oprand1;
	this.oprand2 = oprand2;
	this.operator = operator;
}

//	create a void instance method calculate with no parameter
//	set the result value according to oprand1 oprand2 operator
//	if operator is + - * / calculate result
public void calculate () {
	
	switch (this.operator) {
	case '+':
		  this.result = this.oprand1 + this.oprand2;
	      break;
	case '-':
		  this.result = this.oprand1 - this.oprand2;
		  break;
	case  '*':
		  this.result = this.oprand1 * this.oprand2;
		  break;
	case  '/':
		  this.result = this.oprand1/this.oprand2;
	      break;
	 default:
	 System.out.println("Invalid operator @@@!!!");
	}
	
}

//	Create toString method to return all fields value 
public String toString() {
	return "MathEquation [oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result + ", operator=" + operator
			+ "]";
}






}
