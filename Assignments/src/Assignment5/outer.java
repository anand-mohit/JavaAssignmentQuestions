package Assignment5;

import java.util.logging.Level;
import java.util.logging.Logger;
public class outer {
	static Logger logger;
	
	void method() {
		
	class Palm implements Hand{

		@Override
		public void FacePalm(String str) {
			// TODO Auto-generated method stub
			logger.info("face Palm "+ str);
				
	}}
	
	Palm pal=new Palm();
	pal.FacePalm("dude");
	}

	public static void main(String[] args) {
		  logger = Logger.getLogger(question7.class.getName());
         logger.setLevel(Level.INFO);	
		// TODO Auto-generated method stub
		outer out=new outer();
		out.method();
		

	}

}
