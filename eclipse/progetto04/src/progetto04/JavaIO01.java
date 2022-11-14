package progetto04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIO01 {

	public static void main(String[] args) {
		
		//var fis = new FileInputStream("testo.txt");
	
		FileReader reader;
		FileWriter writer;
		try {
			// in un blocco try è possibile fare operazioni che potenzialmente potrebbero
			// "sollevare" un'eccezione; dentro a try l'eccezione potrà essere gestita
			// e non causerà quindi la terminazione del programma
			reader = new FileReader("testo.txt");
			writer = new FileWriter("nuovo.txt", false);
			
			var bufReader = new BufferedReader(reader);
			var bufWriter = new BufferedWriter(writer);
			
			var riga = bufReader.readLine();
			while( riga != null) {
				System.out.println(riga);
				bufWriter.append(riga);
				riga = bufReader.readLine();
			}
			
			bufReader.close();
			bufWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("Il file non è stato trovato.");
		} catch (IOException e) {
			System.out.println("Si è verificato un errore durante la lettura del file.");
		}
		
	}

}
