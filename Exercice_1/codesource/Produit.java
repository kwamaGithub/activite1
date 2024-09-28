
import java.util.Objects;

public final class Produit {
    /**
     *Constante TVA par défaut.
     */
    private static final double TVA_CONSTANTE = 0.20;

    /**
     *Réference du produit.
     */
    private String reference;

    /**
     *Le prix du produit.
     *
     */
    private double prix;

    /**
     * tva applicable.
     */
    private double tva = TVA_CONSTANTE;


    /**
     *Constructeur.
     *@param paramReference
     */
    public Produit(final String paramReference) {
        this.reference = paramReference;
    }

    /**
     *Cette méthode retourne le prix.
     *
     * @return le prix
     */
    public double getPrix() {
        return this.prix;
    }

    /**
     * modifie le prix.
     *
     * @param paramPrix
     */
    public void setPrix(final double paramPrix) {
        this.prix = paramPrix;
    }

    /**
     * La méthode retourne la reference si le prix est positif, null sinon.
     * @return la reference si le prix est positif, null sinon .
     */
    public  String getReference() {
        String resultat = this.reference;
        if (prix > 0) {
            return resultat;
        }
        return null;
    }

    /**
     * Cette méthdode retourne la valeur tva.
     *
     * @return retourne la tva
     */
    public double getTva() {
        return this.tva;
    }

    /**
     * modifie la tva.
     * @param paramTva
     */
    public void setTva(final double paramTva) {
        this.tva = paramTva;
    }

    /**
     * Renvoie la valeur du code de hachage pour cet objet.
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(this.reference);
    }

    /**
     * Compare les objets de type produit.
     * @param obj
     * @return Renvoie true ou false.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produit other = (Produit) obj;
        return Objects.equals(this.reference, other.reference);
    }

}
