package Assignment2;


	import java.io.File;
	import java.io.FilenameFilter;
	 
	public class PE9 {    
	    public static void main(String a[]){
	        File file = new File("");
	        File[] files = file.listFiles(new FilenameFilter() {
	             
	            @Override
	            public boolean accept(File dir, String name) {
	                if(name.toLowerCase().endsWith("")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(File f:files){
	            System.out.println(f.getName());
	        }
	    }
	}

