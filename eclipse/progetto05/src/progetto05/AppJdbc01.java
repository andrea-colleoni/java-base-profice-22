package progetto05;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppJdbc01 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// se trasformo gli elenchi DB in Collections Java,
		// posso beneficiare dell'utilizzo del'API stream()
		// NB: non confondere con gli Stream di IO
		
		for(var p : elencoPersone()
				.stream()
				// uso una lambda expression per filtrare le persone
				.filter(x -> x.getNome().startsWith("A"))
				.collect(Collectors.toList())) {
			System.out.println(p);
		}
	}
	
	private static List<Persona> elencoPersone() throws SQLException {
		var elenco = new ArrayList<Persona>();
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		var conn = DriverManager.getConnection(
				"jdbc:sqlserver://localhost;encrypt=false;databaseName=JavaBase;", // URL di connessione
				"javabase",  // user
				"password" // password
			);
		
		var st = conn.createStatement();
		var dati = st.executeQuery("SELECT * FROM Persone");
		while(dati.next()) {
			// per ogni iterazione ho accesso alla riga "corrente"
			// NB: next() sposta il cursore alla riga (record) successiva
			// Utilizzo un approccio DAO (see: https://en.wikipedia.org/wiki/Data_access_object)
			elenco.add(map(dati));
		}
		dati.close();
		st.close();
		conn.close();
		return elenco;
	}
	
	private static Persona map(ResultSet record) throws SQLException {
		var p = new Persona();
		p.setIdPersona(record.getInt("IdPersona"));
		p.setNome(record.getString("Nome"));
		p.setCognome(record.getString("Cognome"));
		p.setDataNascita(record.getDate("DataNascita"));
		p.setAltezzaInCm(record.getInt("AltezzaInCm"));
		p.setPesoInKg(record.getFloat("PesoInKg"));
		return p;
	}
}
