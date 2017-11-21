package Assignment3;

import java.util.*;
public class question7 {
    question7(String msg) {
        msg = "This is the string argument."; 
        System.out.println(msg);
    }
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("There's a problem!\n");
        } catch (Exception e) {         
            e.printStackTrace();
        }
        finally {
            System.out.println("I was here.");
        }
    }
}
