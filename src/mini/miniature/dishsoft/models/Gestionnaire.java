package mini.miniature.dishsoft.models;

public class Gestionnaire {
	 private String nom;
	 private String username;
	 private String password;
	 private int Contact;
	 
	 //**************************creation des setters et des getters de l'attribut Nom
	  //getter
	public String getNom() {
		return nom;
	}
	
	//Setter
	public void setNom(String nom) {
		this.nom = nom;
	}
   //****************************Fin creation getter et setter de Nom

	//***************************Setter et getter de Username
	
	//getter
	public String getUsername() {
		return username;
	}
   //Setter
	public void setUsername(String username) {
		this.username = username;
	}	
	//***************************Fin Set et get de Username
	//Setter 
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getContact() {
		return Contact;
	}

	public void setContact(int contact) {
		Contact = contact;
	}
	
	//***************************Fin set and  get Password
	
	 
}
