public class Tools
{
    // A function where the computer picks a random choice.
    /*  1. Picks a random number between 0 and 2.
        2. if 0: returns the choice 'rock'
           if 1: returns the choice 'paper'
           if 2: returns the choice 'scissors' */
    public static String computerChoice () // picks randomly between rock paper and scissors so it doesn't excpect any parameter.
    { 
        int randomNumber = (int) (Math.random() * 3);
        switch (randomNumber) 
        {
            case 0: return "rock";
            case 1: return "paper"; 
            case 2: return "scissors";
            default: return "Error in the app."; // to return a value by this function it must be a default return at the end
        }
    }

    // A function that compares the choices and returns the result.
    public static String result (String yourChoice, String computerChoice)
    {
        String result = "";

        if ((yourChoice.equals("rock") && computerChoice.equals("scissors"))
            || (yourChoice.equals("paper") && computerChoice.equals("rock"))
            || (yourChoice.equals("scissors") && computerChoice.equals("paper")))
        	
        result = "You won!";

        else if ((yourChoice.equals("scissors") && computerChoice.equals("rock"))
            || (yourChoice.equals("rock") && computerChoice.equals("paper"))
            || (yourChoice.equals("paper") && computerChoice.equals("scissors")))
        	
        result = "You lose!";

        else if (yourChoice.equals(computerChoice))
        result = "It's a tie!";
        
        else 
        {
        	 System.out.println("INVALID CHOICE");
             System.exit(0);
        }
        return result;
    }

     // A function that prints your choice, the computer's, and the result.
    public static void printResult (String scanChoice, String copmuterChoice, String result)
    {
        System.out.println("\nYou choose: " + scanChoice);
        System.out.println("The computer chose: " + copmuterChoice);
        System.out.println("result: " + result + "\n");
    }
}
