package progetto03;

public class Lampadina {
	
	// in questa classe utilizzo la tecnica dell'incapsulamento
	
	// un attributo
	private boolean accesa;

	void stampaInfo() {
		//if(accesa == true) {
//		if(accesa) {
//			System.out.println("La lampadina è ACCESA");
//		} else {
//			System.out.println("La lampadina è SPENTA");
//		}
		
		System.out.println("La lampadina è " + (accesa ? "ACCESA" : "SPENTA"));
	}
	public boolean isAccesa() {
		return accesa;
	}
	// se non indico un modificatore di visubilità, la visibilità è default
	public void accendi() {
		accesa = true;
	}
	
	public void spegni() {
		accesa = false;
	}
}
