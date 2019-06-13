package day53_Inheritance_Hiding;

public class OnlineCourse extends Course {
	
	//int capacity; --> inherited field
	int capacity = 300;//hides super class version
	
	public static void main(String[] args) {
		
		Course java = new Course();//nothing to do with sub class
		System.out.println(java.capacity);//150
		
		OnlineCourse sdet = new OnlineCourse();
		System.out.println(sdet.capacity);//300, cuz will first look for closest one same class
		sdet.showCapacity();
		
	}
	
	public void showCapacity() {
		System.out.println("Capacity directly: "+capacity);//300, without this or super it will get from same class
		System.out.println("Online Course capacity: "+this.capacity);//300
		System.out.println("Course capacity: "+super.capacity);//150
	}

}
