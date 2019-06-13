package day47_StaticKey;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentUtility {
		
	// create a private static field called studentList as ArrayList of String
	private static ArrayList<String> studentList;
	
	// create a static block to print out welcome to StudentsUtility 
	static {
		System.out.println("Welcome to StudentUtility");
	}
	
	// create another static block
	// initialize your arrayList object
	// add 10 students
	static {
		loadAllMyData();
		System.out.println("All Students has been loaded");
	}
	
	//create private method that will add10 students
	private static void loadAllMyData() {
		studentList = new ArrayList <> (Arrays.asList("Sayyara", "Maral", "Jennet", "Lacyn", "Zeliha", "Esra N", "Busra", "Firdevs", "Deniz", "Hatice"));
	}
	
	// create a static method called displayAllStudent , accept no param return
	// nothing
	public static void displayAllStudent() {
		
		for (int i=0; i<studentList.size(); i++) {
			System.out.println("No: "+(i+1)+"->"+studentList.get(i));
		}
		System.out.println("-----------------------");
		
	}
	
	// create a static method called addStudent , 
	//accept one parameter as String name
	// and add that name to the list , return no value
    public static void addStudent(String name) {
		studentList.add(name);
	}
    
    // create a static method called updateStudent
    // accept 2 params index as int , newName as String
    // and it will update the name of student at that location
    public static void updateStudent(int idx, String newName) {
		if (idx>=studentList.size()) {
			System.out.println("Out Of Range");
			return;//for getting out of method
			
			//break   : only for switch, loop
			//continue: only for switch, loop
		}
		
		studentList.set(idx, newName);
		
	}
    
    // create a static method called removeStudent
    // accept 1 param index as int
    // and it will remove the name of student at that location
    public static void removeStudent(int idx) {
    	if (idx>=studentList.size()) {
			System.out.println("Out Of Range");
			return;//for getting out of method
		}
    	studentList.remove(idx);
	}
    
    // create a static method called resetTheList
    // accept no param and delete everything in the list
    public static void resetTheList() {
    	studentList.clear();
//		studentList.removeAll(studentList);
	}
}
