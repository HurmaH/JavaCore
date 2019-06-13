package day49_Inheritence;

public class EmployeeEncapsulation {
	
	public static void main(String[] args) {
		FullTimeEmployee f = new FullTimeEmployee();
		f.salary = 100000;
		f.insurance= "Full Coverage";
		f.setId(100);
		f.setTitle("SDET");
		
		Teacher t = new Teacher ();
		t.setId(200); //private field Employee class
		t.setTitle("GoodPerson"); // private field Employee class
		t.salary = 0;
		t.insurance = "Not Available";
		t.teacherId = 5;
		t.energyLevel = 10;
		
		Employee e = new Employee ();
		System.out.println(e.toString());
		System.out.println(e);

	}
	
}
