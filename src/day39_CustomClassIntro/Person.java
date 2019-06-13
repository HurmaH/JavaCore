package day39_CustomClassIntro;

public class Person {
	
		
		String name;
		int age;
		char gender;
	
		//public static void eat () {}
		//any non static method is called instance method
		public static void eat () {
			System.out.println("eating with STATIC");
		}
		
		public void eat2 () {
			System.out.println("eating with NO STATIC");
		}
		
		public void tellMeYourName() {
			System.out.println("My Name is "+name);
		}
		
		public void printPersonInfo () {
			System.out.println("My name is :"+name
					       +" | my age is :"+age
					       +" | my gender is :"+gender);
		}
}
