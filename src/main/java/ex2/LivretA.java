package ex2;

public class LivretA extends CompteBancaire {

	/*public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0, tauxRemuneration);
	}*/

	/** Usage :
	 *   float : tauxRemuneration
	 */
	private float tauxRemuneration;

	/** Constructor for LivretA
	 *  @param wadge the wadge of the account
	 */
	public LivretA(float wadge){
		super();
		denomination = "Livret A";
		tauxRemuneration = wadge;
	}

	/** Constructor for LivretA
	 *  @param initialAmount How much money already on the account
	 *  @param wadge the wadge of the account
	 */
	public LivretA(double initialAmount, float wadge){
		super(initialAmount);
		denomination = "Livret A";
		tauxRemuneration = wadge;

	}


	/* (non-Javadoc)
	 * @see ex2.Compte#debiterMontant(double)
	 * The final amount can't be lower thatn 0
	 */
	public void debiterMontant(double montant) {

		solde -= (solde-montant >= 0)?montant:0;

	}

	/** Apply the anual remuneration for the account	 */
	public void appliquerRemuAnnuelle(){
		solde += solde*tauxRemuneration/100;
	}


	//==============================================================//
	//************************Getters/Setters***********************//
	//==============================================================//


	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public float getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(float tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
