package Assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class question2 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		String[] findstr=new String[3];
		for(int i=0;i<3;i++) {
		 findstr[i] = scan.nextLine();
		 }
		
		Map<String,Integer> map=new HashMap<String,Integer>();  
		
		for(int i=0;i<3;i++) {
			int lastIndex = 0;
			int count = 0;
		while (lastIndex != -1) {

		    lastIndex = str.indexOf(findstr[i], lastIndex);

		    if (lastIndex != -1) {
		        count++;
		        lastIndex += findstr[i].length();
		    }
		}
		 map.put(findstr[i],count);
}
		for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
	}
}
