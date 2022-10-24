package progetto02;

public class AppGeometria02 {

	public static void main(String[] args) {
		
		var t1 = new Triangolo();
		t1.base = 10;
		t1.altezza = 12;
		
		var q = new Quadrato();
		q.lato = 8;
		
		var poli = new PoligonoRegolare();
		poli.lato = 6;
		poli.numeroLati = 7;
		poli.apotema = 5;
		
		// calcolare area e perimetro
		System.out.println("L'area del triangolo è " + t1.area());
		
		// la classe chiamante non sa come sono implementati i metodi
		// nelle classi chiamate; li chiama e si accontenta (non sa)
		// In OOP non sapere è un bene!
		// => Information Hiding
		// => Encapsulation
		// => Indice di accoppiamento (coupling)
		// più è basso "coupling" meno sarà difficile apportare modifiche evolutive al programma
		System.out.println("L'area del quadrato è " + q.area());
		System.out.println("Il perimetro del quadrato è " + q.perimetro());
		
	}

}
