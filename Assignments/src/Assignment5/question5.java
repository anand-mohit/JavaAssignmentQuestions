package Assignment5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class question5 {
	
	
	public static void main(String[]args) {

		 Logger logger = Logger.getLogger(question7.class.getName());
         logger.setLevel(Level.INFO);
         
		Countable cc=(s)->{
			
			return s.length(); 	
		};
		
		Scanner scan= new Scanner(System.in);
		String st=scan.nextLine();
		logger.info(Integer.toString(cc.Count(st)));
		
	}

}
