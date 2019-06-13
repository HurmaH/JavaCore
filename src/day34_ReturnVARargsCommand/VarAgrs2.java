package day34_ReturnVARargsCommand;

public class VarAgrs2 {
	
	public static void main(String[] args) {
		
		printNames ("Isa", "Emir" , "Chika", "Suraya", "Mekan", "Hurmik", "Mishka");
		
		printNames ("Juyje", "Mishka");
		
		printNames (null, "not empty", "");
		
		printNames (null);//will give error when you are trying to take action
	}
	
	public static void printNames (String... names) {
		
		//names are treated as string[]
		System.out.println("You have passed "+ names.length + " arguments");
	}

}
