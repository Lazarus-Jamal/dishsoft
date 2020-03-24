package mini.miniature.dishsoft.controllers;

import mini.miniature.dishsoft.models.Gestionnaire;

public class GestionnaireManager {
	//creation de l'instanciateur de la classe
	private static GestionnaireManager instance = new GestionnaireManager();
	private GestionnaireManager() {
		//contenu du Constructeur 
	}
	
	//creation du getter de l'instanciateur
	public static GestionnaireManager getInstance() {
		return instance; //on retourne le contenu du constructeur
	}

	//Redaction des methodes de la classes de la classe Gestionnaire
	
	public Gestionnaire createaccountgest(String nom, String username, String password, int contact ) {
		Gestionnaire gest = new Gestionnaire();
		gest.setNom(nom);
		gest.setUsername(username);
		gest.setPassword(password);
		gest.setContact(contact);
		
		return gest; //retourne les valeurs à la variable 
	}
}
