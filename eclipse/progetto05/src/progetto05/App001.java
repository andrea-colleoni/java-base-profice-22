package progetto05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App001 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		var testo = new ArrayList<String>();
		
		System.out.println("scrivere del testo, digitare \"::\" per uscire");
		String lettura = sc.nextLine();
		boolean maiuscolo = false;
		while(!"::".equals(lettura)) {
			// BONUS
			if(maiuscolo) {
				char iniziale = lettura.charAt(0);
				lettura = lettura.replace(iniziale, Character.toUpperCase(iniziale));
				maiuscolo = false;
			}
			if(lettura.endsWith(".")) {
				maiuscolo = true;
			}			
			testo.add(lettura);
			lettura = sc.nextLine();
		}
		System.out.print("inserisci un filname: ");
		String fileName = sc.nextLine();
		
		var fw = new FileWriter(fileName, true);
		for(var s : testo) {
			fw.append(s + "\n");
		}
		fw.close();
		sc.close();
		
		System.out.println("uscita dal programma");
	}

}
