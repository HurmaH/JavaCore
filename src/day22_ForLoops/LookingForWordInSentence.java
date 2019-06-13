package day22_ForLoops;

public class LookingForWordInSentence {
	public static void main(String[] args) {
		
		String str = "java kava ava";
		String target = "ava";
		
		int firstIndex = str.indexOf(target);
		int lastIndex = str.lastIndexOf(target);
		
		int index = 0;
		
		while (index<=lastIndex ) {
			index = str.indexOf(target, index);
			System.out.println("Found "+target+" at index : "+index);
			index++;
		}
	}

}
