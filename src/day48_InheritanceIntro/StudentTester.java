package day48_InheritanceIntro;

public class StudentTester {
	public static void main(String[] args) {
		
		Person p = new Person ();
		p.name = "Juyje";
		p.age = 0;
		p.height = 0.001;
		p.gender = 'U';
		
		System.out.println(p.age);
		
		Student s = new Student();
		s.name = "Hurma";
		s.age = 18;
		s.height = 5.1;
		s.gender = 'F';
		
		System.out.println(s.name);
	}

}
