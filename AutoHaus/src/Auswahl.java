import java.util.Scanner;

public class Auswahl 
{
	public static void kaufVerkauf(String auswahl, Scanner scan) 
	{
		switch (auswahl)
		{
			case "a":
				System.out.println("\nIhre Auswahl ist: " + auswahl+ "\n");
				
				System.out.println("Welches Budget haben Sie zur Verfuegung?");
				// Budget-Variation
				double budget = scan.nextDouble();
				if ( budget >= 20_000) 
				{
					 System.out.println("\nSuper! KIA Sportage, VW T-Roc und MG 4 sind verfuegbar.");
				} else if (budget < 20_000 && budget >= 12_000) 
				{
					System.out.println("\nWir haben die folgende guenstige Autos zur Verfuegung: Skoda Fabia, Dacia Spring und Hyundai i10 .");
				} 
				else 
				{ 
					System.out.println("\nDas minimum Budget ist 12000 Euro, um bei uns ein Auto zu kaufen!"); 
					break; 
				}
			
	             System.out.println("\nHaben Sie Autoversicherung? Bitte 'ja' oder 'nein'");
	             scan.nextLine();  //Trap vermeiden.
	             String versicherung = scan.nextLine();
	             
	             System.out.println("\nHaben Sie Fuererschein? Bitte 'ja' oder 'nein'");
	             String fuererschein = scan.nextLine();
	             
	             System.out.println("\nWie hoch ist Ihr SCHUFA-Score?");
	             int score = scan.nextInt();
	             
	          // if (man hat Autoversicherung, Fürerschein und sein SCHUFA-Score großer als 50)
	             if ( versicherung.equals("ja") && fuererschein.equals("ja") && (50 < score)) 
	             {
					System.out.println("\nTop! Es freut uns Ihnen Auto zu verkaufen.");
				 } else  //Die Voraussetzungen sind nicht erfüllt 
				 {	
	            	 System.out.println("\nLeider, Autokauf fuer Sie ist nicht moeglich! Die Voraussetzungen sind nicht erfüllt .\n");
				 }
	             break;
	         
			case "b":  
				System.out.println("\nIhre Wahl ist: " + auswahl+ "\n");
			
				System.out.println("Wie hoch ist der Wert Ihres Autos?");
				int wert = scan.nextInt();
				System.out.println("\nWie hoch ist Ihr Verkaufspreis dafuer?"); 
				int vPreis = scan.nextInt();
				// Wert ist großer als vPreis und vPries ist kleiner als 50_000 Euro
				if (wert > vPreis && vPreis < 50_000) 
				{
					System.out.println("\nSehr gut! Es freut uns Ihr Auto zu kaufen.");
		        } else {
		            System.out.println("\nSorry, wir haben kein Intresse.");
		        }    
		        break;
	
	        default:  
	        	System.out.println("\n"+ auswahl + " ist ungueltige Wahl");
	
		}
	}
}
