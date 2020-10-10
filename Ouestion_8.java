
package Assignment5_ForLoop;

import java.util.Scanner;
public class Ouestion_8 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int userNumber= -1;
		 int sum=0;
		 
		 System.out.print("Please enter number ");
		 userNumber= scanner.nextInt();
		 
	      for (int number =1; number <= userNumber; number++) {
	    	  sum=sum+number;
	    	  
	      }
	   
	      System.out.println("The sum of numbers from 1 to "+userNumber + " is "+ sum );
	}

	}


