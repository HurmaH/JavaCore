package day22_ForLoops;

public class TwinkleStar {
	public static void main(String[] args) {
		
		String song = "Name: Ba Ba Black Sheep Ba";
		String target = "Ba";
		
		int idxOf1Ba= song.indexOf("Ba");
		int idxOf2Ba= song.indexOf("Ba",idxOf1Ba+1 );
		int idxOf3Ba= song.indexOf("Ba",idxOf2Ba+1 );
		
		System.out.println("Index of Ba 1:"+ idxOf1Ba);
		System.out.println("Index of Ba 2:"+ idxOf2Ba);
		System.out.println("Index of Ba 3:"+ idxOf3Ba);
		
	}

}
