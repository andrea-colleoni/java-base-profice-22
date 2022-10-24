package progetto02;

public class Esercizio0101 {

	public static void main(String[] args) {
		/*
		   Scrivere un programma che, definito un numero (deciso a programma) 
		   stampi questo pattern:
	
			Con n = 5 => un quadrato vuoto 5x5
			
			#####
			#   #
			#   #
			#   #
			#####
		 */
		int n = 8;
		for(int riga = 0; riga < n; riga++) {
			for(int colonna = 0; colonna < n; colonna++) {
				if(riga == 0 || riga == (n - 1)) {
					System.out.print("#");
				} else if(colonna == 0 || colonna == (n - 1)) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
