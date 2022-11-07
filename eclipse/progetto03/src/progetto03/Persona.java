package progetto03;

// questa classe è un JavaBean
// - ha lo stato privato
// - ha getters e setters

public class Persona {
	
	private String nome;
	private String cognome;
	private String email;
	
	public Persona() {
		super();
	}

	public Persona(String nome, String cognome, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [cognome=" + cognome + ", nome=" + nome + ", email=" + email + "]";
	}

}
