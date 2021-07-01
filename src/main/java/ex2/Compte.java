package ex2;

public abstract class Compte {

    /** Usage : How myuch ther is on the account
     *   double : solde
     */
    protected double solde;

    /** Usage : The denomination of the account (eg : Livret A)
     *   String : denomination
     */
    protected String denomination;

    /** Usage : The max overdraft allowed for the account.
     *   double : decouvert
     */
    //protected double decouvert;

    /** Empty constructor for Compte. The default amount si set to 0.  */
    public Compte(){
        solde = 0;
    }

    /** Constructor for Compte with preset amount on it.
     *  @param initialAmount How much much is already on the account.
     */
    public Compte(double initialAmount){
        solde = initialAmount;
    }

    /** Ajoute un montant au solde
     * @param montant
     */
    public void ajouterMontant(double montant){
        this.solde += montant;
    }

    /** Ajoute un montant au solde
     * @param montant
     */
    public abstract void debiterMontant(double montant);


    //==============================================================//
    //************************Getters/Setters***********************//
    //==============================================================//

    /** Getter for solde
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /** Setter
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /** Getter for type
     * @return the type
     */
    public String getDenomination() {
        return denomination;
    }
    /** Setter
     * @param type the type to set
     */
    public void setDenomination(String type) {
        denomination = type;
    }
}
