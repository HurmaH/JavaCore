package day49_Inheritence;

public class EmployeeTest {
	
	public static void main(String[] args) {
	
		Employee e = new Employee ();//access title, id if not private

		FullTimeEmployee f = new FullTimeEmployee(); //access to title, id if not private
												 //access to salary, insurance
		Teacher t = new Teacher (); //access to title, id if not private
	 							//access to salary, insurance
								//access teacherId, energyLevel;
	
	}
}
