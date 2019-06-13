package day46_StaticInitializerBlocks;

import java.util.ArrayList;
import java.util.Collections;

public class SlackAction {
	
	public static void main(String[] args) {
		
		SlackUser s0 = new SlackUser (); 
		//1.will go to no arg constr
		//2.will go to 3 arg constructor because of this("", "", int);
		//
		SlackUser s1 = new SlackUser ("magician", "akbar@cybertek.com", 0);
		SlackUser s2 = new SlackUser ("instructor", "instructor@cybertek.com", 0);
		SlackUser s3 = new SlackUser ("student", "student@cybertek.com", 29);
		SlackUser s4 = new SlackUser ("mentor", "mentor@cybertek.com", 20);
		
//optionally , 
//		create a ArrayList of SlackUser add all the objetcs 
//		loop through each item and print out 
//		and call sendMessage on each of them
		
		ArrayList <SlackUser> userList = new ArrayList <>();
		userList.add(s1);
		userList.add(s2);
		userList.add(s3);
		userList.add(s4);
		
		for (SlackUser each : userList) {
			System.out.println(each);
			each.sendMEssage("general", "Good morning!" );
		}
	
	}

}
