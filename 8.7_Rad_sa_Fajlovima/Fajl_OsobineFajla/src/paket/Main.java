package paket;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// Napraviti novi fajl - kao objekat klase File
		File f = new File("C:\\Users\\jelena\\Desktop\\Dokument.java");
		// Argument konstruktora je String tipa i to je putanja nekog fajla

		// Ispitati njegove osobine

		// getName(); Uzeti ime fajla : metoda getName();
		System.out.println("Fajl Ime : " + f.getName());

		// isFile(); Provera da li je fajl zaista fajl
		System.out.println("Da li je fajl : " + f.getName() + (f.isFile() ? " Jeste Fajl" : " Nije Fajl"));

		// getAbsolutePath();Apsolutnu putanju do fajla
		System.out.println("Apsolutna Putanja : " + f.getAbsolutePath());

		// exists(); Provera da li fajl postoji
		System.out.println("Da li postoji fajl : " + (f.exists() ? " Postoji " : " Ne postoji"));

		// isDirectory(); Provera da li je diretktorijul ili fajl
		System.out.println("Direktorijum ili Fajl : " + (f.isDirectory() ? " Direktorijum" : " Fajl"));

		// canRead(); Da li moze biti procitan
		System.out.println("Moze li biti procitan: " + (f.canRead() ? " Da " : " Ne"));

		// canWrite(); Da li je omoguceno upisivanje u njega
		System.out.println("Da li je omoguceno upisivanje u fajl : "
				+ (f.canWrite() ? " Omoguceno je upisivanje!" : " Nije omoguceno je upisivanje!"));

		// length(); velicina fajla
		System.out.println(" Velicina fajla: " + f.length());

		// lastModified(); Poslednja modifikacija fajla
		System.out.println("Poslednja modifikacija fajla: " + f.lastModified());
	}
}
