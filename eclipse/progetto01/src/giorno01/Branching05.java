package giorno01;

public class Branching05 {

	public static void main(String[] args) {
		// controllo di flusso: branching
		int a = 10;
		int b = 20;

		if (a < 10) {
			System.out.println("a è minore di 10");
		} else {
			System.out.println("a è uguale a 10 o è maggiore");
		}

		// di un blocco if può scattare un solo branch, anche se ci sono
		// sovrapposizioni nelle condizioni
		if (b < 10) {
			System.out.println("b è minore di 10");
		} else if (b < 20) {
			System.out.println("b è maggiore di 20");
		} else {
			System.out.println("b è compreso tra 10 e 20");
		}

		// NOTA: per sistemare l'indentazione del codice
		// CTRL + SHIFT + F

		int c = 6;
		// annovero tutti i casi di c che voglio gestire
		switch (c) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("vale da 1 a 5");
			break;
		case 6:
		case 7:
			System.out.println("vale 6 o 7");
			break;
		case 8:
			System.out.println("vale 8");
			break;
		case 9:
			System.out.println("vale 9");
			break;
		case 10:
			System.out.println("vale 10");
			break;
		default:
			System.out.println("il caso non è getito");
		}
		System.out.println("è finito il blocco swith");
	}

}
