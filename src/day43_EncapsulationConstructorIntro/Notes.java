package day43_EncapsulationConstructorIntro;

public class Notes {
	
	// 4 access modifier to define access level of fields of methods 
//	public      --- accessible anywhere
//	protected   -- stay tuned for later
//	default(no) -- package private 
//	private     -- in same class only 
//
//	Good Encapsulation practice 
//	making instance fields private 
//	and providing public getter/setter for the filed for access and modify 
//
//	getter -->> a method for getting the value of your field and the name is specifically recomended in getFieldName() format  and return the value of field
//
//	setter -->> a method for setting the value of your field and the name specically sugested to have 
//	setFieldName(dataType fieldName) and it will set new value for the field and it does not return value 

	  // <this> keyword can be used to address 
	  // the current object|instance being worked on
	
	//CONSTRUCTOR:
	/*
	 * is a special method that being called whenever an object is created
	 * it has same name as class name
	 * it has no return type --- (this does not mean return type is void) 
	 *
	 * if you don't explicitly create one like below 
       compiler will add a empty constructor for you  
       because we can not call something we don't have
	 */
	//new keyword creates object by calling constructor:
	Course softSkill = new Course ();  //1 way creating object
	//Course softSkill2 = new Course ("SDLC"); //2 way creating object
	//Course softSkill3 = new Course ("AGILE", 1234); //3 way creating object
//if you don't explicitly create constructor program will give you by default 
}
