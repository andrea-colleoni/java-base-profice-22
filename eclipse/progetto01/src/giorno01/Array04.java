package giorno01;

public class Array04 {

	public static void main(String[] args) {
		// un array è un vettore, cioè un insieme di valori 
		// tutti dello stesso tipo
		
		int a = 10;
		int[] b; // è un array
		
		// limitazioni: hanno un numero prefissato di elementi, che non può
		// essere modificato
		
		// può essere imopostato solo in fase di inizializzazione
		b = new int[5]; // sarà un array con 5 interi
		b[0] = 10; // l'indice è zero-based
		// ...
		b[4] = 20;
		System.out.println(b[4]);
		// il valore di default di un intero è 0 => b[2] a cui
		// non ho assegnato alcun valore, varrà proprio zero
		System.out.println(b[2]);
		
		// questo sotto invece va in eccezione perché sto accedendo alla VI posizione
		// dell'array che ha solo 5 posizioni disponibili
		b[5] = 30;
		System.out.println("questo pezzo di codice non verrà eseguito");
		
	}

}
