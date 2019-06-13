package day47_StaticKey;
/*
 * import is used to import the type that not under the package
 * 
 * STATIC IMPORT
 *              is used to import visible static members of another class 
 *        we use keyword import static yourClassname.staticMember
 *        just like importing the class, we can use .* to import all static members 
 */

import static day47_StaticKey.StudentUtility.displayAllStudent;
import static day47_StaticKey.StudentUtility.*;

public class StudentImportStatic {
	

	public static void main(String[] args) {
		
		//displayAllStudent();//if it is in same class so no need to type like this StudentUtility.displayAllStudent();
		
		addStudent("Shahriyor");
		addStudent("Ylham");
		displayAllStudent();
		
		updateStudent (100,"Manzire");//will give essage out of range
		updateStudent (0,"Sayyara Rajapova");
		displayAllStudent();
		
		removeStudent(4);
		displayAllStudent();
		
		resetTheList();
		displayAllStudent();
		
	}//end of main method
}
