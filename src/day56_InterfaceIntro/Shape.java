package day56_InterfaceIntro;

abstract class Shape {
	 
	String color;//instance filed 

    public Shape(String color) {//1 arg constructor to set the field value
		this.color = color;
	}

    //abstract methods 
	public abstract void calculatePerimeter();//no return 
	public abstract double calculateArea();   //double return
	
	public abstract String toString(); //method acceet no param , return String 
  }

