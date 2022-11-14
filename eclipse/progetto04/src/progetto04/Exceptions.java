package progetto04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);
		// InputMismatchException si può verificare, ma è unchecked
		// quindi NON SONO OBBLIGATO a gestirla
		try {
			int a = scanner.nextInt();
			System.out.println(a);
		} catch (InputMismatchException e) {
			System.out.println("Quello che hai inserito non è un numero intero!");
		}
		System.out.println("Programma terminato.");
	}

}
