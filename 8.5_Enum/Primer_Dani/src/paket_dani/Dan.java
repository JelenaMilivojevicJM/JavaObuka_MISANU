package paket_dani;

/* U ovom primeru, dodajemo polje ime u Dan enum koje čuva ime dana kao string. 
 * Takođe dodajemo konstruktor koji uzima ime dana kao parametar i dodeljuje ga polju ime. 
 * Na kraju, dodajemo metodu getIme() koja vraća ime dana.*/

public enum Dan {
	PONEDELJAK("Ponedeljak"), UTORAK("Utorak"), SREDA("Sreda"), ČETVRTAK("Četvrtak"), PETAK("Petak"), SUBOTA("Subota"),
	NEDELJA("Nedelja");

	private final String ime;

	Dan(String ime) {
		this.ime = ime;
	}

	public String getIme() {
		return ime;
	}

}
