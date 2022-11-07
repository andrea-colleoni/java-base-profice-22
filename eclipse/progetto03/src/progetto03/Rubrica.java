package progetto03;

import java.util.ArrayList;

public class Rubrica {

	public static void main(String[] args) {
		// utilizziamo il Java Collections Framework per rappresentare l'insieme di persone
		
		// utilizzo "Generics" per specificare il tipo di oggetto che va 
		// nell'ArrayList
		var elenco = new ArrayList<Persona>();
		
		// QUESTI NON SI POSSONO FARE!!
//		elenco.add(1);
//		elenco.add("ciao");
//		elenco.add(new Lampadina());
		
		// QUESTO INVECE SI'
		var p = new Persona();
		p.setNome("Andrea");
		p.setCognome("Colleoni");
		p.setEmail("andrea.colleoni.work@gamil.com");
		
		// 1. utilizzando un puntatore già creato precedentemente
		elenco.add(p);
		
		// 2. utilizzando un costriuttore con campi
		elenco.add(new Persona("Mario", "Rossi", "mario.rossi@gmail.com"));
		
		// 3. utilizzando una classe innestata anonima
		elenco.add(new Persona() {{
		 setNome("Giovanni");
		}});
		
		for(var nominativo : elenco) {
			System.out.println(nominativo);
		}
	}

}
