import java.util.Scanner;

public class Autohaus 
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);	
		System.out.println("\n\t\t\tWillkommen bei Osman-Autohaus\n");
		System.out.println(" -- Auto-Kaufen: 'a' auswaehlen");
		System.out.println(" -- Auto-Verkaufen: 'b' auswaehlen");
		
		Auswahl.kaufVerkauf(scan.nextLine(), scan);
		
		scan.close();
	}
}