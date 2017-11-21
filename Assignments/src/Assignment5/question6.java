package Assignment5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class question6 {

	public static void main(String[] args) {
		 Logger logger = Logger.getLogger(question7.class.getName());
         logger.setLevel(Level.INFO);
		
		Multiply m=( int num) ->{
			return (num*2);
		};
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		logger.info( "Result: "+m.mult(n));
		
	}

}
