package Assignment5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Sequence {

 static int  size;
 
// Logger logger = Logger.getLogger(question7.class.getName());
// logger.setLevel(Level.INFO);
 
class ReverseSequenceSelector implements Selector{


	@Override
	public void end(int a) {
		
		System.exit(a);

		}
			
	@Override
	public void next(int b) {
		System.out.print(b);
		if(b==0) {
			end(0);
		}
		
		current(b-1);
		
		
	}

	@Override
	public void current(int c) {
		System.out.print(c);
		next(c-1);
		
		
	}
	
	
	
}

void reverseSelector() {
	ReverseSequenceSelector rss=new ReverseSequenceSelector();
	rss.current(size);
	
}

	public static void main(String[] args) {
		
		Sequence sel=new Sequence();
		Scanner scan =new Scanner(System.in);
		size=scan.nextInt();
		scan.close();
		sel.reverseSelector();
//		LabelContinue:
//			System.out.println(" ");
//			
	}

}
