package progetto05;

public class Esercizio05 {
	
	/* 
	Creare su un DB a cui hai accesso una tabella Evento, con i seguenti campi:
	- DataOraEvento: datetime
	- Oggetto: varchar
	- Utente: varchar
	- DurataSecondi: int
	- Letto: bit (sì/no)
	- DataOraUltimaModifica: datetime
	
	Creare un programma App01 che:
	- stampi un elenco di tutti gli eventi prenti nella tabella
	- usare l'approccio DAO (=> definire una classe Evento)
	
	Creare un programma App02 che:
	- chieda all'utente le seguenti informazioni:
	  - nome utente
	  - oggetto
	  - durata
	- inserisca un nuovo evento in tabella (SQL INSERT)
	
	Creare un programma App03 che:
	- Visualizzi l'elenco degli eventi non letti (bit Letto = 0)
	- Per ogni evento non letto estratto dal DB, aggiorni il bit di lettura, portandolo ad 1 (SQL UPDATE)
	
	Provare il programma eseguendo diverse sequenze di App02 e App03 e verificando che App03
	mostra solo gli eventi nuovi.
	
	*/
	
}
