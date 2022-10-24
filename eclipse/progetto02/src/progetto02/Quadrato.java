package progetto02;

public class Quadrato extends PoligonoRegolare {
	
	Quadrato() {
		numeroLati = 4;
	}
	
	// metodi
	float area() {
		return (float)Math.pow(lato, 2);
	}

}
