package dataStructures;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class StringMatch {
	 static void printFirst(String s) 
	 { 
	     Pattern p = Pattern.compile("\\b[a-zA-Z]"); 
	     Matcher m = p.matcher(s); 

	     while (m.find()) 
	         System.out.print(m.group()); 

	     System.out.println(); 
	 } 

	 public static void main(String[] args) 
	 { 
	     String s1 = "Geeks for Geeks"; 
	     String s2 = "A Computer Science Portal for Geeks"; 
	     printFirst(s1); 
	     printFirst(s2); 
	 } 
}
