package progetto02;

public class Esercizio0103 {

	public static void main(String[] args) {
		/*
		Scrivere un programma che definito un numero (deciso a programma), 
		stampi questo pattern
		
		n = 7 => progressione di Fibonacci per 7 iterazioni
		(Fibonacci => il numero all'iterazione i = n[i - 1] + n[i - 2])
		
		0:  
		1: #
		2: #
		3: ##
		4: ###
		5: #####
		6: ########
		7: #############
		 */
		int n = 20;
		int p1 = 1;
		int p2 = 0;
		// iterazione zero (una riga vuota)
		System.out.println("0: (0)");
		// iterazione uno (un solo simbolo)
		System.out.println("1. (1)#");
		for(int i = 2; i <= n; i++) {
			int fibonacci = p1 + p2;
			System.out.print(i + ": (" + fibonacci + ")");
			for(int j = 0; j < fibonacci; j++) {
				System.out.print("#");
			}
			System.out.println();
			p2 = p1;
			p1 = fibonacci;
		}
	}
}
