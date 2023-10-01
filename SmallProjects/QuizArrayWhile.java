import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizArrayWhile { 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("\n\t\t*** Mathe-Quiz (leichte Stufe) ***");
		System.out.println("\n>>: Geben Sie die richtigen Antworten der folgenden Fragen ein!\n"
				+ "---------------------------------------------------------------\n");

		List<String> fragenList = new ArrayList<>(); // **Dynamisch, kann geändert werden**
		fragenList.add("2 + 2");
		fragenList.add("5 * 4");
		fragenList.add("10 - 3");
		fragenList.add("44 / 11");
		fragenList.add("9 * 0");

		List<Integer> antwortenList = new ArrayList<>();
		antwortenList.add(4);
		antwortenList.add(20);
		antwortenList.add(7);
		antwortenList.add(4);
		antwortenList.add(0);

		int count = 0;
		int fragNum = 1;
		int score = 0;
		while (count < fragenList.size())
		{
			System.out.print(" >>: " + fragNum + ". Frage: " + fragenList.get(count) + " = ");
			int userEingabe = scan.nextInt();
			if (userEingabe == antwortenList.get(count)) {
				System.out.println(" >>: Richtig\n");
				count++;
				fragNum++;
				score++;
			} else {
				System.out.println(" >>:  Falsch\n");
				count++;
				fragNum++;
			}
		}

		if (score == 5) {
			System.out.println("----------------------------------\n>>: Deine Score: " + score + " von 5 (Prima!)");
		} else if (score == 4 || score == 3) {
			System.out
					.println("-------------------------------------\n>>: Deine Score: " + score + " von 5 (Sehr Gut!)");
		} else {
			System.out.println("---------------------------------------------------\n>>: Deine Score: " + score
					+ " von 5 (Mehr Glück nächstes Mal!)");
		}
		scan.close();
	}
}