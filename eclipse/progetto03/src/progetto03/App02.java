package progetto03;

public class App02 {

	public static void main(String[] args) {
		int n = 10;
		var lampadine = new Lampadina[n];

		for(int i = 0; i < n; i++) {
			lampadine[i] = new Lampadina();
			if(Math.random() >= 0.5) {
				lampadine[i].accendi();
			} else {
				lampadine[i].spegni();
			}
		}
		
		for(var l : lampadine) {
			System.out.print(l.isAccesa() ? "*" : "-");
			if(l.isAccesa()) {
				l.spegni();
			} else {
				l.accendi();
			}
		}
		System.out.println();
		for(var l : lampadine) {
			System.out.print(l.isAccesa() ? "*" : "-");
		}
	}
}
