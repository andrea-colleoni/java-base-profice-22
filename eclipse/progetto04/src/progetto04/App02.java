package progetto04;

import java.util.HashMap;
import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		// una mappa con indice di tipo String e valore, anch'esso di tipo String
		var rubrica = new HashMap<String, String>();
		System.out.println("----- POPOLAMENTO DELLA RUBRICA -----");
		System.out.print("Inserisci un nominativo (stop per terminare): ");
		var nickname = scanner.nextLine();
		// == non funziona con i tipi riferimento, ma solo con i primitivi
		// quindi uso un metodo per verificare l'uguaglianza
		// tutti gli oggetti hanno il metodo equals, che serve per verificare l'uguaglianza
		//    logica tra oggetti
		// String implementa anche metodi di verifica aggiuntivi, oltre a equals
		while(!"stop".equalsIgnoreCase(nickname)) {
			System.out.print("Inserisci il numero di telefono di " + nickname + ": ");
			var telefono = scanner.nextLine();
			rubrica.put(nickname, telefono);
		
			System.out.print("Inserisci un nominativo (stop per terminare): ");
			nickname = scanner.nextLine();
		}
		System.out.println("----- CONSULTAZIONE DELLA RUBRICA -----");
		// fase di consultazione della rubrica
		System.out.print("Inserisci un nominativo (stop per terminare): ");
		nickname = scanner.nextLine();
		while(!"stop".equalsIgnoreCase(nickname)) {
			System.out.println("In numero di telefono di " + 
					nickname + " è " + rubrica.get(nickname));
			
			System.out.print("Inserisci un nominativo (stop per terminare): ");
				nickname = scanner.nextLine();			
		}
		scanner.close();
	}

}
