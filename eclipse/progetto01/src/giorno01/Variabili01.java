package giorno01;

public class Variabili01 {
	// commento
	
	// dichiarazione che rende una classe eseguibile dall'OS
	public static void main(String[] args) {
		
		System.out.println("Ciao!");
		
		// dichiarazione
		int i;
		// dichiarazione + inizializzazione + indicazione della costante di tipo (L)
		long l = 1000L;
		
		// byte, short, int, long
		// float, double
		// boolean
		// char (default UTF8)
		
		// wrapper class
		// auto boxing - auto unboxing
		Integer k = 10;
		i = 20;
		System.out.println(i + k);
		
		// delimitatore di char è '
		char c = 'a';
		Character x = 'x';
		
		// dilimitatore per stringhe è "
		String stringa = "Ciao";
		System.out.println(stringa);
		
		// il compilatore inferisce il tipo dall'assegnazione
		// quindi posso usare 'var'
		var nome = "Andrea";
		
	}
	
}
