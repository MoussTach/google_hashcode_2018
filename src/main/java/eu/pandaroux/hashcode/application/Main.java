package eu.pandaroux.hashcode.application;

import eu.pandaroux.hashcode.algorithm.Essai_class;

public class Main {

    public static void main(String[] args)
    {
        Essai_class essai = new Essai_class("je veux stocker cette chaine de caractere", 42);

        System.out.println(essai.getLaChaine() + " : " + essai.getLeNombre());

        essai.setLaChaine("je change la chaine de la classe en utilisant un setter");

        //ceci est un commentaire
        //Pareil pour les nombres
        essai.setLeNombre(84);

        System.out.println(essai.getLaChaine() + " : " + essai.getLeNombre());
    }
}
