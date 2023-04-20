package jelena.milivojevic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// Kreiranje liste
		List<Grad> listaGradova = new ArrayList<Grad>();

		// Automatsko dodavanje elemenata
		listaGradova.add(new Grad("Beograd", 11000));
		listaGradova.add(new Grad("Nis", 18000));
		listaGradova.add(new Grad("Novi Sad", 21000));
		listaGradova.add(new Grad("Kragujevac", 34000));
		listaGradova.add(new Grad("Subotica", 24000));

		// Kreiranje objekta klase SeDes kako bismo koristili njene metode:
		SeDes sd = new SeDes();

		// Serijalizacija:
		sd.serijalizuj(listaGradova, "FajlGradovi.ser");

		/*
		 * Naziv fajlova cuvamo u formatu ime.ser kako bismo naznacili da se radi o
		 * fajlu koji sadrzi serijalizovanje objekte. Radice program i u slucaju da
		 * stavimo extenziju .txt. Medjutim u tom slucaju svakako sadrzaj fajla nece
		 * biti najjasnije citljiv u smislu govornog jezika. Cak i u slucaju txt
		 * ekstenzije potrebno je izvrsiti deserijalizaciju kako bismo u konzoli videli
		 * jasno sadrzaj fajla.
		 */

		// Deserijalizacija:
		System.out.println("Gradovi: ");
		System.out.println(sd.deserijalizuj("FajlGradovi.ser"));

	}

}
