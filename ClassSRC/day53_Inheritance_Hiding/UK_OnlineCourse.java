package day53_Inheritance_Hiding;

public class UK_OnlineCourse extends OnlineCourse {
	
	int capacity = 200;//hides super class version
	
	public static void main(String[] args) {
		//Course -> OnlineCourse -> UK_OnlineClass
		
		UK_OnlineCourse softSkill = new UK_OnlineCourse();
		System.out.println(softSkill.capacity);//200, cuz will first look for closest one same class
		softSkill.showCapacity();
		
		//if you want to see grant parent field you can access through parent
		
		
	}
	
	@Override
	public void showCapacity() {
		//As long as you have field called capacity in this class
		//below line will always be interpreted as this.capacity
		System.out.println("Capacity directly: "+capacity);//200
		System.out.println("UK_Online Course capacity: "+this.capacity);//200
		System.out.println("OnlineCourse capacity: "+super.capacity);//300
		System.out.println("-----------------------------------");
		super.showCapacity();//Course capacity field access through parent
	}

}
