package progetto02;

public class Esercizio0102 {

	public static void main(String[] args) {
		/*
		 Scrivere un programma che dato un numero < 30 (deciso a programma) verifichi 
		 se è un numero primo
		*/
		int n = 2;
		// un numero primo è divisibile solo per 1 e per se stesso
		// quindi se è primo => tra 1 e il numero, non esiste alcun altro numero
		// la cui divisione dia resto == 0
		boolean trovatoDivisore = false;
		for(int i = 2; i < n; i++) {
			// if(((float)n / i) - (n / i) == 0) {
			if(n % i == 0) {
				//System.out.println("ho trovato un divisore!!! è " + i);
				trovatoDivisore = true;
				break;
			}
		}
		if(!trovatoDivisore) {
			System.out.println("Il numero " + n + " è un numero primo!!");
		} else {
			System.out.println("Il numero " + n + " NON è un numero primo!!");
		}
	}
}
