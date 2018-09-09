
import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		//Welcome Title
		    System.out.println("Dice Roller\n");	         	        
	        Scanner sc = new Scanner(System.in);
	    //input y/n?    
	       String choice = "y";
	      
	    //while loop
	       			while (choice.equalsIgnoreCase("y")) {
	       			System.out.print("Roll the Dice?   (y/n):\n");
	       			choice = sc.next();	
 
	    // Math Random calc to fill in Die     
	       			int D1 = diceRoll();
	       			int D2 = diceRoll(); 
	       			int Total = D1 + D2;
	       
	       			System.out.println("Die 1:  " + D1);
	       			System.out.println("Die 2:  " + D2);
	       			System.out.println("Total:  \n" + Total);
	      
	       //if statement for snake  
	       			if (Total == 2) {
	    	   		System.out.println("Snake Eyes!");}   	    		   
	       			else if (Total == 12)  {
	       			System.out.print("Box cars!");
	        }	    		   	    		    		    	 	    			
	       			}	
	    	sc.close();	       	
	}    			       	        		 
	
			public static int diceRoll() {
			return (int) (Math.random()* 6) + 1;
			}
}