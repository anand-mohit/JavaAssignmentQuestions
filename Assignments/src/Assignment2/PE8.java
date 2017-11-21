package Assignment2;

import java.math.BigInteger;

public class PE8 {
	public static void main(String[] args) {
	
		
		for(int i=0; i <22 ; i++ ) {
            System.out.println(factorial(i));
        }
	}
	
	
	public static String factorial(int n) {
		if(n>=21)throw new IllegalArgumentException( n + " is out of range");
	       BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	   }

	/*public static BigInteger factorial(BigInteger n) {*/
//		BigInteger twentyone= new BigInteger("21");
//		if(n.compareTo(twentyone)<=0)throw new IllegalArgumentException( n + " is out of range");
	    
		/*BigInteger factorial = BigInteger.valueOf(1);
	    if (n.equals(BigInteger.valueOf(0))) {
	        return factorial;
	    }

	    for (int i = 1; i <= n.intValue(); i++) {
	        factorial = factorial.multiply(BigInteger.valueOf(i));
	    }

	    return factorial;
	} */
}
