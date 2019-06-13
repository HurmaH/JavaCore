package day49_Inheritence;

public class AudioBook extends Book {
	//visible fields:
//	int pageCount;
//	String author;
//	int chapterCount;
//	double price;
	
	public int audioLength;
	
	public void play() {
		//we are playing <author>'s book and 
		//it's <audioLength> hour long
		
		System.out.println("we are playing <"+author+">'s book and it's <"
		                   +audioLength+"> hour long");
	}
	

}
