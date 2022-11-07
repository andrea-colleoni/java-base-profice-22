package progetto03;

public class App01 {

	public static void main(String[] args) {
		// invoco il costruttore della classe Lampadina
		var l = new Lampadina();
		
		l.accendi();
		l.stampaInfo();
		l.spegni();
		l.stampaInfo();
		
	}

}
