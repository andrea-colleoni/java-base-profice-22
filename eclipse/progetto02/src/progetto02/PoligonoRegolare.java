package progetto02;

public class PoligonoRegolare {
	
	float lato;
	int numeroLati;
	float apotema;
	
	float area() {
		return  perimetro() * apotema / 2;
	}
	
	float perimetro() {
		return (float)(lato * numeroLati);
	}

}
