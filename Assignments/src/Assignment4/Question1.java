package Assignment4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("size of array");
		int n= scan.nextInt();
		System.out.println("enter names");
		String[]arr=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.next();
		}
	scan.close();
		ArrayList<String> arraylist= new ArrayList<String>();
		Collections.addAll(arraylist, arr);
		arraylist.add("ankur");
		arraylist.add("jaydeep");
		
		for (String str: arraylist)
	    {
	 	System.out.println(str);
	    }
		
	}

}
