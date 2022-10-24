package progetto02;

public class AppGeometria03 {

	public static void main(String[] args) {
		var t1 = new TriangoloEquilatero();
		
		t1.lato = 8;
		System.out.println(t1.perimetro());
		
		var q1 = new Quadrato();
		q1.lato = 13;
		System.out.println(q1.perimetro());

	}
}
