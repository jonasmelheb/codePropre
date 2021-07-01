package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire extends Compte{

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;


	/**
	 * @param solde
	 *
	 */
	public CompteBancaire(double solde) {
		super(solde);
		denomination = "Compte Banquaire";
		this.decouvert = decouvert;
	}


	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		solde -= (solde-montant >= decouvert)?montant:0;
	}


	//==============================================================//
	//************************Getters/Setters***********************//
	//==============================================================//


	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
