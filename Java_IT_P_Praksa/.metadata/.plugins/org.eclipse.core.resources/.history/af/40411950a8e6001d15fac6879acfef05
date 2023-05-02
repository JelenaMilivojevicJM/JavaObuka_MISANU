package praksa;

public enum Smajliji {
	/*
	 * Kreiramo konstante različitih smajlija koji su nam potrebni, a koje koristimo
	 * pri regex proveri. Svaka od ovih konstanti je inicijalizovana sa
	 * odgovarajućim Unicode stringom koji predstavlja smajli. Znači, svaki smajli
	 * ima svoju tačnu šifru, odnosno kod koji je u skladu sa Java Unicode kodnim
	 * sistemom. Kako bi različita radna okruženja mogla da ga adekvatno prepoznaju.
	 */

	SRECAN("\uD83D\uDE42"), 
	VESEO("\uD83D\uDE04"), 
	LJUBAV("\uD83D\uDE0D"), 
	CMOK("\uD83D\uDE18"), 
	TUZAN("\uD83D\uDE1E"),
	PLACE("\uD83D\uDE22"), 
	LJUT("\uD83D\uDC7F"), 
	KISASUZA("\uD83D\uDE2D");

	/*
	 * Privatno polje kod koje čuva Unicode string za svaku konstantu. Polje je
	 * privatno kako bi se sprečio neovlašćeni pristup i menjanje vrednosti polja
	 * izvan klase.
	 */
	private final String kod;

	/*
	 * Konstruktor koji se poziva prilikom inicijalizacije svake konstante, i prima
	 * jedan argument tipa String i postavlja vrednost polja kod. Argument
	 * predstavlja Unicode string koji odgovara smajliju.
	 */

	Smajliji(String kod) {
		this.kod = kod;
	}

	/* Metoda getKod() koja vraća vrednost polja kod. */
	public String getKod() {
		return kod;
	}
}