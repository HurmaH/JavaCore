package day41_EncapsulationIntro;

public class NotesEncapsulationMurodil {
	
	//ENCAPSULATION - Hiding Class data by making variables PRIVATE
	/*
	 * Encapsulation is the technique of making the variable in a class private
	 * Private variables cannot be accessed outside the class
	 * Therefore it is known as Data Hiding
	 * Provide access to private fields via public methods
	 * 
	 * public class Student {
	 *  private int ssn;
	 *  private String name;
	 * }
	 * 
	 * ssn & name field can be accessed accessed with Studen class block only
	 * outside of class there is no direct access to these varibles
	 */
	//GETTERS and SETTERS
	/*
	 * We provide access to private variables by adding public 
	 * GETTER and SETTER method in to our class
	 * 
	 */
	//Example
	/* public class Book {
	 * private String title;
	 * }
	 * 
	 * public String getTitle () { // public - accessable to everyone, cannot be void
	 *                             //we are able to read only
	 *    return title;            //returns private title 
	 * }
	 * 
	 * public void setTitle (String newTitle) { //no return, purpose is to take value and assign
	 *    title = newTitle;                     //wherever value passed to setTitle, can be equal to private title
	 * }
	 * 
	 * We can still access private variable because we are in same class
	 */
	
	/*public class Library {
	        public static void main(String[] args) {
		    Book book1 = new Book();
		    book1.setTitle("Grit");   //if we will not setTitle, getTitle will give default value like null for Strin
	 *      System.out.println("Title 1:" + book1.getTitle());
	 */

}
