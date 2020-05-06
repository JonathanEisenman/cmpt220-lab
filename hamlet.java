package jonathaneisenmanlabx;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner; 
public class hamlet 
{ 
  public static void main(String[] args) throws Exception  
  { 
    // pass the path to the file as a parameter 
    File file = new File ("/Users/eisen/OneDrive/Desktop/hamlet.txt");; 
    Scanner sc = new Scanner(file);
    int wordCount = 0;
    String word1 = "thou";
    String word2 = "Thou";
  	
    while(sc.hasNext()) {
    	
    	String word = sc.next();
    	if (word.equals(word1) || word.equals(word2)) 
    	wordCount++;
    }
    System.out.println("Word of thou: " + wordCount);
  }
}
