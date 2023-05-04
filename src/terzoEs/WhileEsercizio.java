package terzoEs;

import java.util.Arrays;
import java.util.Scanner;

public class WhileEsercizio {

	public static void main(String[] args) {
		Separate();

	}
	public static void Separate() {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		String name = in.nextLine();
		
		
		while(!name.contains(":q")) {
			String[] textSplitted = name.split("");
			System.out.println(Arrays.toString(textSplitted));
			break;
		};
		
		if(name.contains(":q")) {
			System.out.println("Arrivederci.");
		}
		in.close();
	}

}
