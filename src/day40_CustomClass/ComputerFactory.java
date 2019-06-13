package day40_CustomClass;

public class ComputerFactory {
	
	//it ;s highly not recommended to have main method directly
		//inside your template class--> use different class to create object
		public static void main(String[] args) {
			
			Computer iMac = new Computer();
			Computer macPro= new Computer();
			
			
			//System.out.println(type); //we cannot access instance variable outside of instance method
			System.out.println("--------IMAC-------");
			System.out.println(iMac.type); //we had to creat object to pass instance field,
			System.out.println(iMac.OS);
			System.out.println(iMac.screenSize);
			System.out.println(iMac.color);
			System.out.println(iMac.isPersonal);
			
			
			macPro.type = "Mac Desktop";
			macPro.OS = "MacOS";
			macPro.screenSize=27.0;
			macPro.color = "silver";
			macPro.isPersonal=true;
			macPro.ram = 128;
			
			
			System.out.println("--------MACPRO-------");
			System.out.println(macPro.type); //we had to creat object to pass instance field,
			System.out.println(macPro.OS);
			System.out.println(macPro.screenSize);
			System.out.println(macPro.color);
			System.out.println(macPro.isPersonal);
			
			
		}

}
