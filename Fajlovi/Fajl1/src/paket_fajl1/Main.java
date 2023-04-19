package paket_fajl1;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// UCITAVANJE FAJLA u WorkSpace:
		// Napraviti novi fajl - kao objekat klase File

		File f = new File("C:\\Users\\jelen\\OneDrive\\Desktop\\Dokument.java");
		// Argument ove metode je STring tipa i to je putanja nekog fajla
		// Tip ovog fajla u particiji je AllFiles
		// Dodaj u imenu fajla, prilikom save as na kraju .java da bi ga shvatilo kao
		// fajl

		// Ispitati njegove osobine

		// 1. getName(); Uzeti ime fajla : metoda getName();
		System.out.println("Fajl Ime : " + f.getName());

		// 2. isFile(); Provera da li je fajl zaista fajl
		System.out.println("Da li je fajl : " + f.getName() + (f.isFile() ? " Jeste Fajl" : " Nije Fajl"));

		// 3. getAbsolutePath(); Napisati apsolutnu putanju do fajla (Od korena do
		// zadatog fajla)
		System.out.println("Apsolutna Putanja : " + f.getAbsolutePath());

		// 4. exists(); Provera da li fajl postoji
		System.out.println("Da li postoji fajl : " + (f.exists() ? " Postoji " : " Ne postoji"));

		// 5. isDirectory(); Provera da li je diretktorijul ili fajl
		System.out.println("Direktorijum ili Fajl : " + (f.isDirectory() ? " Direktorijum" : " Fajl"));

		// 6.canRead(); Da li moze biti procitan
		System.out.println("Moze li biti procitan: " + (f.canRead() ? " Da " : " Ne"));

		// 7. canWrite(); Da li je omoguceno upisivanje u njega
		System.out.println("Da li je omoguceno upisivanje u fajl : "
				+ (f.canWrite() ? " Omoguceno je upisivanje!" : " Nije omoguceno je upisivanje!"));

		// 8. length(); velicina fajla
		System.out.println(" Velicina fajla: " + f.length());

		// 9. lastModified(); Poslednja doifikacija fajla
		System.out.println("Poslednja modifikacija fajla: " + f.lastModified());

	}

}
