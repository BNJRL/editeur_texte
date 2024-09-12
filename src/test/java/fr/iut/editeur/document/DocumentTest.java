package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testAjouter(){
        Document document = new Document();
        assertTrue(document.getTexte() == "");
        document.ajouter("bonjour");
        assertTrue(document.getTexte().equals("bonjour"));
    }
    @Test
    public void testClearAvecAjouter(){
        Document document = new Document();
        assertTrue(document.getTexte() == "");
        document.ajouter("bonjour");
        assertTrue(document.getTexte().equals("bonjour"));
        document.clear();
        assertTrue(document.getTexte().equals(""));
    }
}
