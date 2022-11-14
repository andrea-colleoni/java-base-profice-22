package progetto04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App03 {

	public static void main(String[] args) {
		var adesso = new GregorianCalendar();
		
		System.out.print("Oggi è ");
		String[] ggSettimana  = {"N.D.", "domenica", "lunedì", "martedì", "mercoledì", "giovedì", "venerdì", "sabato"};

		System.out.print(ggSettimana[adesso.get(Calendar.DAY_OF_WEEK)]);
		
		String[] mmAnno  = {"gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio", "agosto", 
					"settembre", "ottobre", "novembre", "dicembre"};
		
		System.out.print(" " + adesso.get(Calendar.DAY_OF_MONTH) + " di " + mmAnno[adesso.get(Calendar.MONTH)]);
	}

}
