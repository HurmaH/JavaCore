package day45_EncapsulationConstructor;

public class StudentChaning {
	
	public static void main(String[] args) {
		System.out.println("s1:");
		Student s1 = new Student ();
		
		System.out.println("s2:");
		Student s2 = new Student("Hatice");
		
		System.out.println("s3:");
		Student s3 = new Student ("Emir", 6, "being kid");
	}

}
