package progetto02;

public class Programma01 {

	public static void main(String[] args) {
		var s1 = new Sedia(); // chiamata ad un costruttore
		s1.marca = "Guzzini";
		s1.modello = "Ottobre 22";
		s1.prezzo = 150.0F;
		
		// istanze della classe Sedia => Oggetti
		// s1 e s2 sono due "oggetti" di classe "Sedia"
		var s2 = new Sedia();
		s2.marca = "Ikea";
		s2.modello = "UBITIU";
		s2.prezzo = 47.5F;

	}

}
