package giorno01;

public class Operatori02 {
	
	public static void main(String[] args) {
		
		// matematici
		// +, -, *, /, %
		
		// overload degli operatori
		int a = 10;
		int b = 20;
		
		System.out.println(a + b);
		// l'operatore + in presenza di operandi di tipo diverso si comporta
		// in modo diverso
		var x = "Andrea";
		var y = "Colleoni";
		
		System.out.println(x + y);
		
		// di confronto: <, <, >=, <=, !=, ==
		// si applicano a due operandi e restituiscono un "boolean"
		// => due possibile esiti: true, false
		System.out.println(1 != 2);
		
		// logici: & (bitwise), &&, | (bitwise), ||, !
		System.out.println(true && true && false && true);
		System.out.println(true & true & false & true);
		
		System.out.println(true || true || false || true);
		System.out.println(true | true | false | true);
	}

}
