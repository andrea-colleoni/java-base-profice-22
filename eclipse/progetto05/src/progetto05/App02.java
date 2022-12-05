package progetto05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App02 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		var testo = new ArrayList<String>();
		
		System.out.println("scrivere il nuome di un file");
		String fileName = sc.nextLine();
		var fr = new BufferedReader(new FileReader(fileName));
		var lettura = fr.readLine();
		while(lettura != null) {
			char iniziale = lettura.charAt(0);
			if(Character.isLetter(iniziale)) {
				lettura = lettura.toUpperCase();
			}
			if(Character.isDigit(iniziale)) {
				lettura = lettura.toLowerCase();
			}
			testo.add(lettura);
			lettura = fr.readLine();
		}
		fr.close();
		var fw = new FileWriter("risultato.txt", true);
		for(var s : testo) {
			fw.append(s + "\n");
		}
		fw.close();
		sc.close();
	}
}
