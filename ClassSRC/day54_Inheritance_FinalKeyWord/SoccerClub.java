package day54_Inheritance_FinalKeyWord;

import day54_Inheritance_FinalKeyWord.soccer.Stadium;
/* HAS-A Relationship can be built using instance variable with referance type
 * SoccerClub HAS-A relationship with Stadium, by putting Stadium as instance variable
 * SoccerClub has access to everything visible that Stadium object can have 
 */
public class SoccerClub {
	
	int playerCount;
	String name;
	Stadium st;
	
	//3 args constructor
	public SoccerClub(int playerCount, String name, Stadium st) {
//		super();
		this.playerCount = playerCount;
		this.name = name;
		this.st = st;
	}
	
	public char getInitial() {
		return  name.charAt(0);  
	}
	
	public int getStatdiumCapacity() {
		//return st.capacity ;	
		return  st.getCapacity();
	}
	
	public static void main(String[] args) {
		Stadium st = new Stadium(10000, "Burger"); 
		System.out.println( st.toString() );
		
		SoccerClub chelcea = new SoccerClub(25, "Chelcea", st); 
		System.out.println(  chelcea.getInitial()  );
		
		System.out.println(chelcea.toString());
		System.out.println(  chelcea.getStatdiumCapacity()  );
	}
	
	//Getters and Setters
	public int getPlayerCount() {
		return playerCount;
	}

	

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Stadium getStadium() {
		return st;
	}

	public void setStadium(Stadium stadium) {
		this.st = stadium;
	}
	
	
    //toString method
	@Override
	public String toString() {
		return "SoccerClub [playerCount=" + playerCount + ", name=" + name + ", stadium="
				+ st + "]";
	}
	
	
	
	
	
	

}


