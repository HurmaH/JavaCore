package day52_InheritanceFinal_InitializerBlock;


public class practice extends class1 {
		//Invisible features
	    //default constructor
	    //String name = "Cybertek";
	
	    //void method1() { }
	
	void method2() {
		method1();
		
		practice obj = new practice();
		System.out.println(obj.students);//protected field
		
		class1 obj2 = new class1();
		System.out.println(obj2.students);
	}
	
	
	
}

class class1 {
	private String place = "Virginia"; //1. private not acceble in sub class
	
	String name = "Cybertek";          //2.default accessable in same package but not in different

	protected int students = 300;      //3. protected accessable for subclass in different and same package
	
	public boolean onlyOnline = false; //4. public acceble everywhere in the universe :)
	void method1() {
		
	}
}