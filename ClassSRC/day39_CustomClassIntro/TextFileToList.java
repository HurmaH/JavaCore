package day39_CustomClassIntro;
import java.nio.file.*;
import java.util.*;

public class TextFileToList {
	public static void main(String[] args) {
		
		List<String> lineLst = getTextFileAsList("usFam.txt");//same package
        System.out.println(lineLst);
         
        String path = "C:\\Users\\Hurmik\\eclipse-workspace\\1.Spring2019_JavaProject_1\\School.txt";
        
        List<String> lineLst2 = getTextFileAsList(path);//through path
        System.out.println(lineLst2);
        
        List<String> lineLst3 = getTextFileAsList("Files.txt");
        System.out.println(lineLst3);
       
        //size
        System.out.println("Size: "+lineLst3.size());
        
        //xls, doc, ppt, pdf ---> file extensions in File.txt
        String s = "sapien_quis.xls";
        //how to get file extension
        String fileExt= s.substring(s.indexOf(".")+1);
        System.out.println(fileExt);
        
        int countXLS = 0;
        int countDOC = 0;
        int countPDF = 0;
        int countPPT = 0;
        for(String each: lineLst3) {
        	if (each.endsWith(".xls")) countXLS++;
                	
        	if (each.endsWith(".doc")) countDOC++;
        	
        	if (each.endsWith(".pdf")) countPDF++;
        	
        	if (each.endsWith(".ppt")) countPPT++;
        	
        }
        
        System.out.println("xls file count: "+countXLS);
        System.out.println("doc file count: "+countDOC);
        System.out.println("pdf file count: "+countPDF);
        System.out.println("ppt file count: "+countPPT);
        
        //find out longest file name
        String longestName = lineLst3.get(0);
        for (String each : lineLst3) {
        	if (longestName.length() <each.length()) {
        		longestName =each;
        	}
        }
        System.out.println("Longest file name: "+longestName );
        
        //longest xls file name
        String longestXLS = "";
        for (String each:lineLst3 ) {
        	if (each.endsWith(".xls") && longestXLS.length()<each.length()) {
        		longestXLS = each;
        	}
        }
        System.out.println("Longest excel file: "+longestXLS);
        
        //delete longestword
        System.out.println(lineLst3.contains(longestXLS));//before remove
        lineLst3.remove(longestXLS);
        System.out.println(lineLst3.contains(longestXLS));//after remove
	}
	
	/*
	   * DO NOT MODIFY AND JUST USE IT
	   * Method name : getTextFileAsList
	   * @parameter  location of text file as String
	   *   if your file is at root path (right under project folder)
	   *  you may directly path your filename.txt
	   *  if not pass /your/own/folder/name/filename.txt as String to method
	   * 
	   * @return List of String that contain each line as per element

	   */
	  public static List<String> getTextFileAsList(String filePath) {

	    List<String> allLines = null;
	    try {
	      allLines = Files.readAllLines(Paths.get(filePath));
	    } catch (Exception e) {
	      System.out.println("Wrong file path probably");
	    }
	    return allLines;

	  }
}
