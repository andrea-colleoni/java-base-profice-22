package giorno01;

public class Looping06 {

	public static void main(String[] args) {
		// while (fin tanto che...)
		int a = -10;
		// entrerò nel ciclo se e solo se la condizione è vera
		// ad ogni terazione verificherò se la condizione permane vera
		// se premane vera => eseguirò un'altra iterazione
		while(a > 0) {
			System.out.println(a);
			a -= 1; // => a = a - 1;
		}
		a = -10;
		// mi assicura che almeno una volta esegua il ciclo
		do {
			System.out.println(a);
			a -= 1;
		} while(a > 0);
		// solo alla fine della prima iterazione io verificherò per la prima
		// volta la condizione che mi permette di eseguire di nuovo il ciclo
		
		// dentro la parentesi ho tre istruzioni:
		// la prima viene eseguita solo una volta, prima di entrare nel ciclo
		// la seconda è una condizione: viene valutata ad ogni inzio ciclo => se è true, entro
		// la terza: viene eseguita ogni volta che raggiungo la fine del ciclo 
		for(int i = 0;  i < 10; i++) {
			System.out.println(i);
		}
//		int k = 100;
//		for(;;k++) {
//			System.out.println("ciao " + k);
//		}
		int[] numeriPrimi = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		// for each
		for(var num : numeriPrimi) {
			System.out.println(num);
		}
	}

}
