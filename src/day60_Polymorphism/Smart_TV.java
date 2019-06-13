package day60_Polymorphism;
//Smart_TV as sub class 
//hide the channelCount field   give default value of 200
// override the play method 
// 
// create main method 
// create Smart_TV object and assign it to TV reference variable 
// try to access what's available 
public class Smart_TV extends TV {
	
	int channelCount = 200;
	
	@Override
	public void play() {
		System.out.println("Playing Smart_TV");
	}
	//this will give channelCount=200:
	
//	@Override
//	public int getChannelCount() {
//		return this.channelCount;
//	}
	
	//if not Overriden getChannel it will call getChannelCount in super class:
	
	@Override
	public int getChannelCount() {
		// TODO Auto-generated method stub
		return super.getChannelCount();
	}
	
	//@Override --static method can be hidden only
	public static void doStatic() {
		System.out.println("Do Smart_TV Static");
	}
	
	public static void main(String[] args) {
		
		TV tv = new Smart_TV();
		System.out.println(tv.channelCount);//NOT 200, but 100, because, referance type decides what to access
		tv.play();//Smart_TV
		System.out.println(tv.getChannelCount());//100
	    tv.doStatic();//TV
	    TV.doStatic();//TV
	    Smart_TV.doStatic();//
		
	}
	

}
