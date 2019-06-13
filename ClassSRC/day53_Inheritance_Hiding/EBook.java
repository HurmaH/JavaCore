package day53_Inheritance_Hiding;
//We can have more than one class in one source file
//however onlyone should be public

public class EBook extends Book{
	//Sub class can hide super class's field by redeclaring it
	//the only thing matters is the <NAME>
	
	float name=12.11f;;
	long page=100;//changed data type, hide parent field
	private static double weight = 1;
	
	public static void main(String[] args) {
		
		System.out.println(EBook.weight); //className.staticFieldName
		
		EBook eb = new EBook();
		System.out.println(eb.name);
		eb.showValue();
		
		
	}
	
	public void showValue() {
		System.out.println(super.name +"---"+this.name);
		System.out.println(super.page +"---"+this.page);
		System.out.println(super.weight +"---"+weight);//instance acces everything, staticly only static field
		
	}

}


class Book {
	
	String name="BookName";
	int page=10;
	double weight=5;
}



