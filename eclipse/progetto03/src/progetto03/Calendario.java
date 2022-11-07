package progetto03;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Calendario {

	public static void main(String[] args) {
		// data di oggi in italiano usando nomi giorni/mesi
		// Uso di Map e Date, Calendar
				
		// EPOCH è il 1 gennaio 1970
		// internamente le date sono rappresentate come il n. di ms trascorsi da EPOCH
		
		// ctrl + shift + o
		var oggi = new Date();
		System.out.println(oggi);
		Calendar cal = new GregorianCalendar();
		var weekDay = cal.get(Calendar.DAY_OF_WEEK);
		var month = cal.get(Calendar.MONTH);
		
		// 1: domenica ..... 7 sabato
		var giorni = new HashMap<Integer, String>();
		giorni.put(1, "Domenica");
		giorni.put(2, "Lunedì");
		giorni.put(3, "Martedì");
		giorni.put(4, "Mercoledì");
		giorni.put(5, "Giovedì");
		giorni.put(6, "Venerdì");
		giorni.put(7, "Sabato");
		
		var mesi = new HashMap<Integer, String>();
		mesi.put(0, "Gennaio");
		mesi.put(1, "Febbraio");
		mesi.put(2, "Marzo");
		mesi.put(3, "Aprile");
		mesi.put(4, "Maggio");
		mesi.put(5, "Giugno");
		mesi.put(6, "Luglio");
		mesi.put(7, "Agosto");
		mesi.put(8, "Settembre");
		mesi.put(9, "Ottobre");
		mesi.put(10, "Novembre");
		mesi.put(11, "Dicembre");
		
//		System.out.println(mesi.get(month));
//		System.out.println(giorni.get(weekDay));
		System.out.println("Oggi è il " + cal.get(Calendar.DAY_OF_MONTH) + " di "
				+ mesi.get(month) + " del " + cal.get(Calendar.YEAR) + 
				" ed è un " + giorni.get(weekDay));
	}

}
