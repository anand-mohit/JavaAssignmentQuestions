package Assignment2;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class PE4 {
	 public static void main(String[] args) {

	        try {
	            System.out.print("Enter the file name with extension : ");

	            Scanner input = new Scanner(System.in);

	            File file = new File(input.nextLine());

	            input = new Scanner(file);


	            while (input.hasNextLine()) {
	                String line = input.nextLine();
	                System.out.println(line);
	            }
	            input.close();

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
}
