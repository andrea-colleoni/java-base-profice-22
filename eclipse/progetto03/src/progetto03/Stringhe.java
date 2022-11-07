package progetto03;

public class Stringhe {

	public static void main(String[] args) {
		var testo = "Oggi 7 novembre, abbiamo svolto la nostra III "
				+ "lezione di Java, che è interessante...";
		
		System.out.println(testo.toLowerCase());
		System.out.println(testo.toUpperCase());
		
		System.out.println(testo.charAt(10));
		System.out.println(testo.indexOf(","));
		System.out.println(testo.indexOf(",", 16));
		System.out.println(testo.length());
		
		System.out.println(testo.substring(16));
		System.out.println(testo.substring(16, 61));
		
		var elenco = "lunedì,martedì,mercoledì,giovedì,venerdì,sabato,domenica";
		var giorni = elenco.split(",");
		
		var mesi = new String[6];
		mesi[0] = "gennaio";
		mesi[1] = "febbraio";
		mesi[2] = "marzo";
		mesi[3] = "aprile";
		mesi[4] = "maggio";
		mesi[5] = "giugno";
		
		var nomiMesi = String.join("@_@", mesi);
		System.out.println(nomiMesi);
		
	}

}
