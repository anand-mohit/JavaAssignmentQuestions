package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class PE6 {
	public static float avg(int n1,int n2) {
		float avg=n1/n2;
		return avg;
		
	}
	public static int min(int[]arr) {
		Arrays.sort(arr);
		return(arr[0]);
		
	}
	public static int max(int[]arra,int size) {
		return (arra[size-1]);
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("  Enter the number of students: ");
		int nos= scan.nextInt();
		int[] arros= new int[nos];
		int sum =0;
		for(int i=0;i<nos;i++) {
			System.out.print("  Enter the number of student"+(i+1)+":");
			arros[i]=scan.nextInt();
			sum+=arros[i];
		}
		int minimum=min(arros);
		int maximum=max(arros,nos);
		
		System.out.println("The average is "+ avg(sum,nos));
		System.out.println("The minimum is "+ minimum );
		System.out.println("The maximum is "+ maximum);
		
		
	
	}

}
