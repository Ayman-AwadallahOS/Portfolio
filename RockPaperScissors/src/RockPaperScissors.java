import java.util.Scanner;

public class RockPaperScissors 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n-- Let's play Rock Paper Scissors.");
        System.out.println("-- When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("-- Are you ready? Write 'yes' if you are.");

    // See if the user wants to play. 
        String answer = scan.nextLine();

    // Set up the game
        if (answer.equals("yes")) 
        {
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors, shoot!\n");

            String userChoice = scan.nextLine();
            String compChoice = Tools.computerChoice();
            String finalResult = Tools.result (userChoice, compChoice);
            Tools.printResult(userChoice, compChoice, finalResult);
        } 
        
        else {
            System.out.println("\nDarn, some other time...!\n");
        } 

        scan.close();
    }
}
