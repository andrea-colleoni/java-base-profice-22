package giorno01;

public class Metodi07 {
	
	public static void main(String[] args) {
		int[] numeriPrimi = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for(var num : numeriPrimi) {
			// chiamata di metodo
			stampaNumeroPrimo(num);
		}
	}
	
	
	// anatomia della funzione (METODO)
	
	// tipo di dato restituito
	// nome
	// () => contengono gli argomenti
	static void stampaNumeroPrimo(int numeroPrimo) {
		// un metodo che "restituisce" void
		// non avrà l'istruzione return
		System.out.println("un numero primo: " + numeroPrimo);
	}
	
	int dammiUnNUmero() {
		// restituire il valore alla fine
		// return è sempre l'ultima cosa che si fa in un metodo
		return 1;
	}

}
