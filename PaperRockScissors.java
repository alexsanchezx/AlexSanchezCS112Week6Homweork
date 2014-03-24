	import java.util.Random;
	import java.util.Scanner;
	
public class PaperRockScissors {

	
	private static Scanner tKeyboard;

	public static void main(String[] args) {
	        
	        Random random = new Random();
	        int cpuChoice;
	        String input;
	        //rock=1 paper=2 scissors=3
	        System.out.println("Lets play rock paper scissors!");
	        System.out.println("Enter your Choice.");
	        cpuChoice= random.nextInt(2)+1;
	        tKeyboard = new Scanner(System.in);
	        input = tKeyboard.nextLine();
	        {
	            switch(input.toLowerCase()) {
	                case "rock":
					if(cpuChoice==2)
	                    {
	                        System.out.println("I got Paper! You Lose!");
	                    }
	                    else if (cpuChoice == 3)
	                    {
	                        System.out.println("I got Scissors! You Win!");
	                    }
	                    else
	                    {
	                        System.out.println("I got Rock! It's a Tie!");
	                    }
	                    break;   
	                    
	                case "paper":              
					if(cpuChoice==1)
	                    {
	                        System.out.println("I got Rock! You Win!");
	                    }
	                    else if (cpuChoice == 3)
	                    {
	                        System.out.println("I got Scissors! You Lose!");
	                    }
	                    else
	                    {
	                        System.out.println("I got Paper! It's a Tie!");
	                    }
	                    break;
	                    
	                case "scissors":              
					if(cpuChoice==1)
	                    {
	                        System.out.println("I got Rock! You Lose!");
	                    }
	                    else if (cpuChoice == 2)
	                    {
	                        System.out.println("I got Paper! You Win!");
	                    }
	                    else
	                    {
	                        System.out.println("I got Scissors! It's a Tie!");
	                    }
	                    break;
	                    
	                default: 
	                    System.out.println("Thats not a choice! Try agian!");
	                    break;
	            }
	        }
	        
	    }
	    
	}