package Assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class question3 {
	public static void main(String[]args) {
		Map<String,Boolean> map=new HashMap<String,Boolean>();  
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++){
			str[i]=scan.next();
}
		for (String ch:str) {
		if(map.containsKey(ch)) {
			map.put(ch, true);
		}
		else {
			map.put(ch, false);
		}	
	}
		System.out.println(map.toString());

}}
