package jelena.milivojevic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SeDes {

	// SERIJALIZACIJA:

	/*
	 * Serijalizovan objekat IDE U FILE. Da bismo serijalizovali objekat potrebno
	 * nam je da koristimo dve kljucne klase za serijalizaciju objekta: 1.
	 * ObjectOutputStream (oos) - on konvertuje JAVA objekt u sekvencu bajtova i
	 * zapisuje ih pomocu fos-a u file ili u bazu podataka (zato je fos njegov
	 * parametar); 2. FileOutputStream (fos) - on smesta sekvencu Byte-ova unutar
	 * file-a i oznacava zapis binarnih podataka u fajl.
	 */
	/*
	 * Zasto se koristi? • Da se sacuva stanje nekog objekta, i kao takvom mu
	 * pristupimo i nakon zavrsetka rada aplikacije. • Za prenos podataka - prenost
	 * stanja objekta (dostupnost stanja objekta na razlicitim lokacijama). - jer
	 * sekvencu bajtova mozemo prenositi bilogde i bilokuda kroz mrezu i
	 * rekonstruistai je negde druge u citljivi objekat. • Moze da sluzi kao
	 * svojevrsna simulacija baze podataka koja je dosta brza od klasicnih baza
	 * podataka, jer se nalazi objekat tada u radnoj memoriji racunara, i nema se
	 * potreba za upotrebom file sistema za pristup bazi.
	 */

	/*
	 * Metoda za serijalizaciju: - ona samo salje u fajl koji kreira za to.
	 * Parametri (sta zelimo da serijalizujemo,naziv fajla gde serijalizujemo
	 * objekte)
	 */

	public void serijalizuj(List<Grad> listaGradova, String nazivFajla) throws FileNotFoundException, IOException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nazivFajla));

		oos.writeObject(listaGradova);
		/*
		 * oos poziva svoju metodu write za ispis objekata( kao argumente navodimo koje
		 * objekte). Dakle, svaki put kada kreiramo novi objekat, odnosno dodamo novi
		 * grad u listu - on ce ga zapisati.
		 */
		oos.close();

	}

	// DESERIJALIZACIJA:

	/*
	 * DEserijalizacija - je proces rekonstruisanja objekta koji je prethodno vec
	 * serijalizovan. Znaci, Serijalizovan objekat IDE IZ FILEa nazad u object. Da
	 * bismo serijalizovali objekat potrebno nam je da koristimo dve kljucne klase
	 * za serijalizaciju objekta: 1. ObjectInputStream (ois) - sekvencu bajtova
	 * vraca u objekat; 2. FileInputStream (fis) - vraca sekvencu bajtova.
	 */
	/*
	 * Novi metod je za deserijalizaciju. Metoda za deserijalizaciju: - ona vraca iz
	 * fajla ono sto je upisano. Tip podataka koje vraca ova metoda je tip liste.
	 * Taj tip metode koje cemo desijarizovati pokalpa se sa tipom koji smo
	 * serijalizovali Parametar je naziv fajla u kojem se nalazi taj serijalizovani
	 * objekat (lista objekata).
	 */
	public List<Grad> deserijalizuj(String nazivFajla)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nazivFajla));

		/*
		 * Unutar ovog metoda kreiramo listu u koju smestamo te deserijalizovane
		 * podatke: Koriscenje metode objekta ois, koja ima za zadatak da cita podatke
		 * iz fajla i vraca ih u sekvencu bajtova koji se dalje konvertuju u objekat
		 */

		/*
		 * Primenjeno je kastovanje - znaci dodelicemo ulogu tom objektu da se radi o
		 * listi gradova Zatim te takve procitane podatke smestamo u nasu listu gradova.
		 */
		List<Grad> listaGradova = (List<Grad>) ois.readObject();

		ois.close();
		// Naznacavamo da metoda vraca vrednost kreirane liste
		return listaGradova;

	}

}
