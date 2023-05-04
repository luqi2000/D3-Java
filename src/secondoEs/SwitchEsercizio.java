package secondoEs;

public class SwitchEsercizio {

	public static void main(String[] args) {
		NumbertoLetter(2);

	}


	public static void NumbertoLetter(int number){
		switch (number) {
			case 0: {
				System.out.println("zero");
			break;
			}
			case 1: {
				System.out.println("uno");
				break;
			}
			case 2: {
				System.out.println("uno");
				break;
			}
			case 3: {
				System.out.println("uno");
				break;
			}
			default:
				System.out.println("Valid numbers only from 0 to 3");
			}
	}
}