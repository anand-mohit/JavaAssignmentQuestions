package Assignment;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int n= scan.nextInt();
	
	if(n%2==0 && (n>=20 && n<=30)) {
		System.out.println("Jerry");
		
	}
	else if (n%2!=0 && (n>=20 && n<=30)){
		System.out.println("Tom");
	}

}}
