package primoEs;

public class IfElse {
	public static boolean stringaPariDispari(String stringa){
		if(stringa.length()%2 == 0) {
			return true;
			
		}else {
			return false;
		}
	}

	
	public static boolean annoBisestile(int anno) {
		if(anno % 4 == 0 || (anno % 100 == 0 && anno % 400 == 0)) {
			return true;
		}else {
			return false;
			
		}
	}
}
