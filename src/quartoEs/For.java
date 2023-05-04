package quartoEs;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		ContoRovescia();
	}
	
	public static void ContoRovescia() {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero intero");
		 int number = in.nextInt();
		 for(int i = number; i>=0; i--) {
			 System.out.println(i);
		 }
		 
		in.close();
	}
}
