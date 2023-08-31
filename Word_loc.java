package csc_assignment;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Spell_Checker {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a file: ");
		ArrayList<String> word = new ArrayList<>();
			try
			{
			String filename = scan.nextLine();
			File file = new File(filename);
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				word.add(line); 
			}
			System.out.println("Search here: ");	     
	        while(scan.hasNextLine()){ 	        	
	        String search = scan.nextLine();	        
	        	if(search.equals("stop")) {     		
	        		 System.out.println("Bye!");
	        		 break;
	        	 }
	        	boolean wordFound = false;
	        	for (int i = 0; i < word.size(); i ++){	        	  
	        	if (word.get(i).equals(search)){	        	  
	        		System.out.println("The word '" + search + "' was found in position "+ (i + 1)) ;
	        		wordFound = true;	          
	            }	                   
	          }
	        	if(wordFound ==false) {	        	  
	        		System.out.println("Sorry, the word '"+ search + "' was not found");	          
	           }	       
	         }
	        input.close();  
			}
			catch(IOException e){// for the file that doesn't open properly
				System.out.println("Unable to open");
			}
			scan.close();		
	}
}
