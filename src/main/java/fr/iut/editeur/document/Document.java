package fr.iut.editeur.document;

/**
 * La classe Document est la classe principale
 */
public class Document {

    /**
     * L'attribut correspond au texte
     */
    private String texte;

    /**
     * constructeur initialisant l'attribut texte
     */
    public Document() {
        this.texte = "";
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * permet d'ajouter du texte
     * @param texte étant le texte à rajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * La méthode remplace une partie du texte par un autre à l'aide de coordonnées
     * @param debut une valeur comprise entre 0 et texte.length-1
     * @param fin une valeur comprise entre 0 et texte.length-1
     * @param remplacement le texte que l'on souhaite insérer
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * majuscules permet de passer la partie du texte séléctionné en majuscules !
     * @param debut une valeur comprise entre 0 et texte.length
     * @param fin une valeur comprise entre 0 et texte.length
     */
    public void majuscules(int debut, int fin) {
        String maj = texte.substring(debut, fin+1);
        String modif = maj.toUpperCase();
        remplacer(debut, fin, modif);
    }

    /**
     * La méthode effacer permet de retirer la partie séléctionné du texte
     * @param debut une valeur comprise entre 0 et texte.length
     * @param fin une valeur comprise entre 0 et texte.length
     */
    public void effacer(int debut, int fin){
        remplacer(debut,fin,"");
    }

    /**
     * La méthode permet de réinitialiser l'entièreté du texte.
     */
    public void clear(){
        effacer(0,texte.length()-1);
        this.texte += "d";
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
