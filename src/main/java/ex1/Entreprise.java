package ex1;

import java.util.Date;

public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;
	
	public static final int CAPITALE_MAX = 3000000;
	
	public void afficherStatut(){
		
	}

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public static int getCapitaleMax() {
		return CAPITALE_MAX;
	}
}
