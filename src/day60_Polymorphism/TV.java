package day60_Polymorphism;
//TV as super class 
// int channelCount ;  give default value of 100
// create a instance method play 
// add getChannleCount method in super class and return channel count 
// override this method in sub class and call see what will you get
public class TV {
	
	int channelCount=100;
	
	public void play() {
		System.out.println("Playing TV");
	}
	
	public int getChannelCount() {
		return this.channelCount;
	}
	
	public static void doStatic() {
		System.out.println("Do TV Static");
	}

}
