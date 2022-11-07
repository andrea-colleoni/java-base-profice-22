package progetto03;

import java.util.Scanner;

public class InputUtente {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
//		System.out.print("Scrivi qualcosa > ");
//		var riga = sc.nextLine();
//		System.out.println("Ok... hai scritto: " + riga);
		
		System.out.print(" > ");
		var riga = sc.nextLine();
		// test di stringa nulla o vuota
		while(!"".equalsIgnoreCase(riga)) {
			System.out.println("Hai scritto > " + riga);
			System.out.print(" > ");
			riga = sc.nextLine();
		}
		System.out.println("Programma terminato.");
	}

}
