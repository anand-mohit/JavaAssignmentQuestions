package Assignment;
import java.util.*;
public class Question {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int sum=0;
		int n= scan.nextInt();
		int number=n;
		int reverse=0;
		String temp = Integer.toString(n);
		int[] array = new int[temp.length()];
		
	    while (n != 0) {
	        int remainder = n % 10;
	        reverse = reverse * 10 + remainder;
	        n = n/ 10;
	    }
	    
	    if (number == reverse) {
	    	System.out.println("This Number is a Palindrome");
			   for (int i=0;i<array.length;i++) {
				   
				   if(i%2==0)
				   sum=sum+array[i];}
				   
				    if(sum>25) {
			    		System.out.println("the sum of even numbers is greater than 25");
			    	}
				    else {
				    	System.out.println("the sum of even numbers is less than 25");
				    }
	        
	    }
	    
	    else {
	    	System.out.println("This Number is not a Palindrome");
	}

}

}
