package progetto05;

import java.util.ArrayList;
import java.util.Comparator;

public class AppInterfFunzionali {

	public static void main(String[] args) {
		
		var elenco = new ArrayList<Persona>();
		
		// esempio di un anonympous inner type
		elenco.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getAltezzaInCm() - o2.getAltezzaInCm();
			}
		});
		
		// lambda => semplificare la scrittura delle interfacce funzionali (da java 1.8 in poi)
		// evitando:
		// 1. di creare un file apposta con l'implementazione
		// 2. di creare una "brutta" implementazione di un Anonymous Inner Type
		elenco.sort((o1, o2) -> o1.getAltezzaInCm() - o2.getAltezzaInCm());
		//elenco.sort((o1, o2) -> o1.getPesoInKg() - o2.getPesoInKg());

	}

}
