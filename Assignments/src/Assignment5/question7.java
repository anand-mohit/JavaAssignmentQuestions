package Assignment5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class question7 {
	
 

    public static void main(String[] args) {

    	
        Logger logger = Logger.getLogger(question7.class.getName());
         logger.setLevel(Level.INFO);	
    	
        // TODO Auto-generated method stub
    	    
        Factor f1=(a,b)->{
            if(a%b==0) {
                return (b + " is a factor of " + a);
            }else {
                return (b + " is not a factor of " + a);
            }
              
           };  
           Scanner scan = new Scanner(System.in);
//                System.out.println("Result: "+ f1.isFactor(scan.nextInt(),  scan.nextInt()));
           logger.info("Result: "+ f1.isFactor(scan.nextInt(),  scan.nextInt()));

    }

    }
