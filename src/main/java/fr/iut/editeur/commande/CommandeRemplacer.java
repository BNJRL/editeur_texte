package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer(){
        if(parameters.length < 3 || parameters.length > 5){
            System.err.println("Format attendu : remplacer;nbDebut;nbFin;texte");
            return;
        }
        String texte;
        try{
            texte = parameters[3];
        } catch (ArrayIndexOutOfBoundsException e){
            texte = "";
        }

        this.document.remplacer(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2]),texte);
        super.executer();
    }
}
