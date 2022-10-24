package progetto02;

// ereditarietà
public class TriangoloEquilatero extends PoligonoRegolare {
	
	// PoligonoRegolare è la super classe di TriangoloEquilatero
	// TriangoloEquilatero è una sotto classe di PoligonoRegolare
	
	// In Java: una classe può avere una sola super classe (una classe non
	// può ereditare da più di una classe)
	// una classe può avere un numero arbitrario di sottoclassi
	
	public TriangoloEquilatero() {
		numeroLati = 3;
	}	
	
}
