package praksa;

import java.io.Serializable;

//1. Креирајте класу карактера која садржи податке за сваки карактер у got_meta_data.txt фајлу. 
//Klasa "Karakter" sadrzi podatke(polja) za svaki karakter u pomenutom fajlu:

public class Karakter implements Serializable {
	//Gererisani serijski broj klase 
	private static final long serialVersionUID = 7732177178796230417L;
	
	// Tri privatna polja: name, allegiance i messagesFile
	private String name;
	private String allegiance;
	private String messagesFile;

	// Parametrizovani konstruktor klase:
	public Karakter(String name, String allegiance, String messagesFile) {
		this.name = name;
		this.allegiance = allegiance;
		this.messagesFile = messagesFile;
	}

	// Dohvatanje vrednosti polja name
	public String getName() {
		return name;
	}

	// Postavljanje vrednosti za polje name
	public void setName(String name) {
		this.name = name;
	}

	// Dohvatanje vrednosti polja allegiance
	public String getAllegiance() {
		return allegiance;
	}

	// Postavljanje vrednosti za polje allegiance
	public void setAllegiance(String allegiance) {
		this.allegiance = allegiance;
	}

	// Dohvatanje vrednosti polja messagesFile
	public String getMessagesFile() {
		return messagesFile;
	}

	// Postavljanje vrednosti za polje messagesFile
	public void setMessagesFile(String messagesFile) {
		this.messagesFile = messagesFile;
	}
}

