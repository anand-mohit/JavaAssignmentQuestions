package Assignment2;

import java.util.Scanner;

public class PE5 {
	public static boolean isEven(int number) {
		if(number%2==0) {
		return true;}
		else return false;
		}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		if(isEven(num)==true) {
			System.out.println("True");
		}
		else System.out.println("False");
	
	
	}
	
	}
	


