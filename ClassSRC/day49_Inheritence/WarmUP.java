package day49_Inheritence;

public class WarmUP {
	
	public static void main(String[] args) {
		
		AudioBook a1 = new AudioBook ();
		a1.author = "Suzanne Collins";
		a1.audioLength = 3;
		a1.chapterCount = 7;
		a1.pageCount = 300;
		a1.price = 12.99;
		a1.printAuthor();
		a1.play();
		
		PaperBook p1 = new PaperBook();
		p1.author = "Suzanne Collins2";
		p1.chapterCount = 34;
		p1.weight = 0.750;
		p1.isHardCover = true;
		p1.printAuthor();
		
	}
	
	

}
