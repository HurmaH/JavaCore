package day46_StaticInitializerBlocks;

public class PersonTestCounting {
	
	public static void main(String[] args) {
		
		Person p0= new Person();
		System.out.println(Person.counter);
		Person p1 = new Person ("Hurmik", 5.3f, 'F');
		Person p2 = new Person ("Mekan", 5.8f, 'M');
		Person p3 = new Person ("Juyje", 0.01f, 'N');
		
		System.out.println(Person.counter);//total objects created
		//System.out.println(Person.howMany); gives error
		
		System.out.println(p1.howMany);//1
		System.out.println(p2.howMany);//1
		System.out.println(p3.howMany);//1
		System.out.println(Person.counter);//3
		
		//static way to access static variable
		System.out.println(Person.race);
		
		//nonstatic way to access static variable
		//highly not recommended
		System.out.println(p1.race);
		System.out.println(p2.race);
		
		Person.race = "Homosapiens";
		System.out.println(p1.race);
		System.out.println(p2.race);
		
		p1.race = "Spartan";
		System.out.println(p1.race);
		System.out.println(p2.race);
	}

}
