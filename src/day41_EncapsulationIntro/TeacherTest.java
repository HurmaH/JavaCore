package day41_EncapsulationIntro;

public class TeacherTest {
	
	public static void main(String[] args) {
		
		Teacher akbar = new Teacher ();
		
		//akbar.name;//fields are private we cannot acces
		//akbar.speciality;//fields are private we cannot acces
		
		akbar.setName("Akbar");
		akbar.setSpeciality("Magician");
		
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpeciality());
	}

}
