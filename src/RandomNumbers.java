
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	
	

	public static void main(String[] args) {
		
		
		 int counter;
		 Random rnum = new Random();
		 int[] numbers = new int [500];
		 numbers[0]= 0;
		 
		 for(counter = 1; counter < 500; counter++) {
		numbers[counter] = rnum.nextInt(500);
		
		 
		 }
			  
			  
			
		 System.out.println("Random Numbers:" +Arrays.toString(numbers));
		   System.out.println("*************");
		
	        
	       
		   Arrays.sort(numbers);
			 System.out.println("List of array is: " + Arrays.toString(numbers));
			 
			 System.out.println("Ask user for the Nth smallest number");
			 Scanner userIn = new Scanner(System.in);
		      int n = userIn.nextInt();
		      System.out.println(numbers[n]);
			
		      
		
		
			   
		   }
			
	  

			  
	        

		 


	} 
	
	
		 
	
	
		
	



	
	
	
	


