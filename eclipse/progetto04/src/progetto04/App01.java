package progetto04;

import java.util.ArrayList;
import java.util.Scanner;

public class App01 {

	public static void main(String[] args) {
		// leggo da tastiera quello che digita l'utente
		var scanner = new Scanner(System.in);
		
		var listaDiNumeri = new ArrayList<Integer>();
		System.out.print("Inserisci un numero: ");
		var numero = scanner.nextInt();
		while( numero != 0 ) {
			listaDiNumeri.add(numero);
			System.out.print("Inserisci un numero: ");
			numero = scanner.nextInt();
		}
		scanner.close();
		
		Integer min = null;
		Integer max = null;
		Integer somma = 0;
		for(var n : listaDiNumeri) {
			if(min == null || min > n) {
				min = n;
			}
			if(max == null || max < n) {
				max = n;
			}
			somma += n;
		}
		System.out.println("Il minimo numero digitato è: " + min);
		System.out.println("Il massimo numero digitato è: " + max);
		System.out.println("La media dei numeri digitati è: " + 
				((float) somma/(float) listaDiNumeri.size()));
	}

}
