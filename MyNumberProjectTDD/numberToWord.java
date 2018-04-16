package devops;
import java.io.BufferedReader;
import java.util.Scanner;

import org.junit.Assert;

public class numberToWord {
	
	String[] units = {"",  "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", 
			            "Thirteen", "Fourteen", "Fifteen", "Sixteen","Seventeen", "Eighteen", "Nineteen" 
			         };
	
	String[] tens = {"",  "", "Twenty", "Thirty", "Forty", "Fifty",  "Sixty", 
			          "Seventy", "Eighty", "Ninty" 
                     };
	
	public static void main(){
		
		numberToWord numberToWord = new numberToWord();
		
		
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			
			 System.out.println(" Enter a number to convert to words: (0 to Exit)");				
		     int n = reader.nextInt();
		     
		     if (n == 0){
		    	System.out.println(" Bye !!!");
		 		reader.close();
		     }
		     else {
		
		     String theNumber = numberToWord.convertNumber(n);
		
		     System.out.println("The number %d conversion is: " + theNumber);
		     System.out.println(" Enter a number to convert to words: (0 to Exit) ");
		    }
		}
	}
	
	public int validNumber (int n){
		
		if (n > 0 && n < 1000){
			
		System.out.println( "Valid Number");
		
		return (n);
		}
		else
		return (0);
		
	}
	
	public String convertNumber (int n){
		
		String theNumberinWords = " ";
		 int number = n;
		
		if (validNumber(number) > 0) {
			
				
			if ((number % 20) == number) {
			
				theNumberinWords = units[number];
				System.out.println(theNumberinWords);
				return theNumberinWords;
			}
			
			else if ((number % 10) == 0) {
				
				if (number < 100){
				    theNumberinWords = tens[number/10];
				}else
					theNumberinWords = units[number/100] + " Hundred";
				System.out.println(theNumberinWords);
				return theNumberinWords;
				
			}
			else if (number < 100){
				theNumberinWords = tens[number/10] + " " + units[number % 10];
				System.out.println(theNumberinWords);
				return theNumberinWords;
			}
			else if (number > 100){
				
				theNumberinWords = units[number/100]+ " Hundred and " + tens[(number % 100)/10] + " " + units[number % 10];
				System.out.println(theNumberinWords);
				return theNumberinWords;
			}
		}
		
		return theNumberinWords;
	}

	
}
