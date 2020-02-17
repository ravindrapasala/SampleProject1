package Pack1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner (System.in);
		  System.out.println("Enter value");
	        String word = input.next();
	        String r = "";
	        for(int i=word.length()-1; i>=0; i--)
	            r += word.charAt(i);
	        System.out.println(r);        
	    }
	}
	

