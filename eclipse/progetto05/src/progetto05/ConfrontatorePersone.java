package progetto05;

import java.util.Comparator;

public class ConfrontatorePersone implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getAltezzaInCm() - o2.getAltezzaInCm();
	}

}
