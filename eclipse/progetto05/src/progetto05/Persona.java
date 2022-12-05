package progetto05;

import java.util.Date;

public class Persona {
	
	private Integer idPersona;
	private String nome;
	private String cognome;
	private Date dataNascita;
	private Integer altezzaInCm;
	private Float pesoInKg;
	
	
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
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
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public Integer getAltezzaInCm() {
		return altezzaInCm;
	}
	public void setAltezzaInCm(Integer altezzaInCm) {
		this.altezzaInCm = altezzaInCm;
	}
	public Float getPesoInKg() {
		return pesoInKg;
	}
	public void setPesoInKg(Float pesoInKg) {
		this.pesoInKg = pesoInKg;
	}
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + ", altezzaInCm=" + altezzaInCm + ", pesoInKg=" + pesoInKg + "]";
	}
	
	

}
