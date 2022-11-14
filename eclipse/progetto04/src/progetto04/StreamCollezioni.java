package progetto04;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamCollezioni {

	public static void main(String[] args) {
		var collezione = new ArrayList<String>();
		collezione.add("ciao");
		collezione.add("buongiorno");
		collezione.add("good morning");
		collezione.add("bonjour");
		collezione.add("buona sera");
		collezione.add("arrivederci");
		
		
		Predicate<String> filtro = saluto -> saluto.startsWith("b");
		
		var conteggioConLaB = collezione.stream()
			.filter(filtro)
			.count();
		
		var salutiConLaB = collezione.stream()
			.filter(filtro)
			.map(saluto -> saluto.toUpperCase())
			.collect(Collectors.toList());
		
		System.out.println(conteggioConLaB);
		for(var s : salutiConLaB) {
			System.out.println(s);
		}
	}

}
